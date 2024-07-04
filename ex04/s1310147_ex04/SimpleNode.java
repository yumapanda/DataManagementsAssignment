class SimpleNode{
    private SimpleNode prev;
    private SimpleNode next;
    int key;

    SimpleNode(){}

    SimpleNode(int key, SimpleNode p, SimpleNode n){
        this.key = key;
        prev = p;
        next = n;
    }

    public SimpleNode getPrev(){ return prev; }
    public SimpleNode getNext(){ return next; }
    public void setPrev(SimpleNode n){ prev = n; }
    public void setNext(SimpleNode n){ next = n; }

    void setKey(int k){ key = k; }
    int getKey(){ return key; }
}