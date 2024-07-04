public class SimpleList implements Aggregate {
    private SimpleNode nil;

    public SimpleList() {
        nil = new SimpleNode(null); 
        nil.setNext(nil);
    }

    public SimpleNode getNil() {
        return nil;
    }

    public void insert(Object data) {
        SimpleNode node = new SimpleNode(data);
        node.setNext(nil.getNext());
        nil.setNext(node);
    }

    public void delete(Object data) {
        SimpleNode prev = nil;
        SimpleNode cur = nil.getNext();
        while (cur != nil) {
            if (cur.getData().equals(data)) {
                prev.setNext(cur.getNext());
                return;
            }
            prev = cur;
            cur = cur.getNext();
        }
    }

    @Override
    public Iterator forwardIterator() {
        return new SimpleListForwardIterator(this);
    }

    @Override
    public Iterator backwardIterator() {
        return new SimpleListBackwardIterator(this);
    }
}
