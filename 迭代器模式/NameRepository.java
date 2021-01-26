package 迭代器模式;

/**
 * @Author Aqinn
 * @Date 2020/11/15 11:39 上午
 */
public class NameRepository implements Container {

    public String names[] = {"Aqinn", "biu", "pia"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? names[index++] : null;
        }
    }

}
