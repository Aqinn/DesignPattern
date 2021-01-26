package 生产者消费者模式;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @Author Aqinn
 * @Date 2021/1/26 10:52 上午
 */
public class 使用wait和notify {

    private static final int CAPACITY = 5;

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        Thread producer1 = new Producer("P-1", queue, CAPACITY);
        Thread producer2 = new Producer("P-2", queue, CAPACITY);

        Thread consumer1 = new Consumer("C-1", queue, CAPACITY);
        Thread consumer2 = new Consumer("C-2", queue, CAPACITY);
        Thread consumer3 = new Consumer("C-3", queue, CAPACITY);

        producer1.start();
        producer2.start();

        consumer1.start();
        consumer2.start();
        consumer3.start();

    }


    /**
     * 生产者
     */
    public static class Producer extends Thread {

        private Queue<Integer> queue;
        private String mName;
        private Integer mMaxSize;
        private int mCount = 0;

        public Producer(String name, Queue<Integer> queue, Integer maxSize) {
            this.queue = queue;
            this.mName = name;
            this.mMaxSize = maxSize;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == mMaxSize) {
                        try {
                            System.out.println("Queue is full, Producer[" + mName + "] thread waiting for consumer to take the product from queue.");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("[" + mName + "] Producing product's value : +" + mCount);
                    queue.offer(mCount++);
                    queue.notifyAll();
                    try {
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * 消费者
     */
    public static class Consumer extends Thread {
        private Queue<Integer> queue;
        private String mName;
        private Integer mMaxSize;

        public Consumer(String mName, Queue<Integer> queue, Integer mMaxSize) {
            this.queue = queue;
            this.mName = mName;
            this.mMaxSize = mMaxSize;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            System.out.println("Queue is empty, Consumer[" + mName + "] is waiting for product.");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int x = queue.poll();
                    System.out.println("[" + mName + "] consuming product's value: " + x);
                    queue.notifyAll();

                    try {
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

