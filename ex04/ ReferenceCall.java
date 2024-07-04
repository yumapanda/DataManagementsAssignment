public class ReferenceCall{
 public void test(){
 Point p = new Point(8, 5);
 System.out.println("(x, y) = (" + p.getX() + ", " + p.getY() + ")");
 movePoint(p);
 System.out.println("(x, y) = (" + p.getX() + ", " + p.getY() + ")");
 initPoint(p);
 System.out.println("(x, y) = (" + p.getX() + ", " + p.getY() + ")");
 }
 private void movePoint(Point o){
 o.setX(100);
 o.setY(120);
 }
 private void initPoint(Point o){
 o = new Point(0, 0);
 }
 public static void main(String[] args){
 new ReferenceCall().test();
 }
}