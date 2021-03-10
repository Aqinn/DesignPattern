package 生产者消费者模式;

import java.util.Queue;

/**
 * @Author Aqinn
 * @Date 2021/2/7 2:00 下午
 */
public class 字节面试模拟 {

    class Producer extends Thread{

        private Queue<Integer> mQueue;
        private int mCap;
        private int mCur;
        private String mName;

        public Producer(String name, Queue<Integer> q, int cap){
            mQueue = q;
            mName = name;
            mCap = cap;
            mCur = 0;
        }

        public void run(){
            while (true) {
                synchronized (mQueue){
                    while (mCur == mCap){
                        try {
                            mQueue.wait();
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    mQueue.offer(++mCur);
                    mQueue.notifyAll();
                }
            }
        }

    }

    class Custom extends Thread{
        private String mName;
        private Queue<Integer> mQueue;
        public Custom(String name, Queue<Integer> q){
            mName = name;
            mQueue = q;
        }

        public void run(){
            while (true){
                synchronized (mQueue){
                    while (mQueue.isEmpty()){
                        try {
                            mQueue.wait();
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    mQueue.poll();
                    mQueue.notifyAll();
                }
            }
        }

    }

}
