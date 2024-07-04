public class SimpleListForwardIterator implements Iterator {
    private SimpleList simpleList;
    private SimpleNode cur;

    public SimpleListForwardIterator(SimpleList simpleList) {
        this.simpleList = simpleList;
        this.cur = simpleList.getNil().getNext();
    }

    @Override
    public boolean hasNext() {
        return cur != simpleList.getNil();
    }

    @Override
    public Object next() {
        Object data = cur.getData();
        cur = cur.getNext();
        return data;
    }
}

