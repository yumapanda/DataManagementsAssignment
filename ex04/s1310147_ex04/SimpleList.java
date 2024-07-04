class SimpleList{
 private SimpleNode nil;
 SimpleList(){
 init();
 }
 void init(){
 nil = new SimpleNode();
 nil.setNext(nil);
 nil.setPrev(nil);
}
 SimpleNode listSearch(int key){
 /* your code */
    SimpleNode cur = nil.getNext();
    while( cur != nil && cur.key != key ){
        cur = cur.getNext();
    }
    return cur;
 }
 void printList(){
 /* your code */
    SimpleNode cur = nil.getNext();
    int isf = 1;
    while(true){
        if( cur == nil ) break;
        if( isf == 0) System.out.print(" ");
        System.out.print(cur.getKey());
        cur = cur.getNext();
        isf = 0;
     }
     System.out.println();
}

void deleteNode(SimpleNode t){
    t.getPrev().setNext(t.getNext());
    t.getNext().setPrev(t.getPrev());
}

 void delete(int key){
 /* your code */
    SimpleNode t = listSearch(key);
    if(t == nil) return;
    deleteNode(t);
 }
 void insert(int key){
 /* your code */
    SimpleNode x;
    x = new SimpleNode();
    x.setKey(key);
    x.setNext(nil.getNext());
    nil.getNext().setPrev(x);
    nil.setNext(x);
    x.setPrev(nil);
 }
}