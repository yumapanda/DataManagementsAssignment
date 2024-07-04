public class SimpleNode {
    private Object data;
    private SimpleNode next;

    public SimpleNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SimpleNode getNext() {
        return next;
    }

    public void setNext(SimpleNode next) {
        this.next = next;
    }
}
