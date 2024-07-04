import java.util.Scanner;
class StackApplication{
 public static void main(String[] args){
 Stack st = new Stack(100);
 Scanner sc = new Scanner(System.in);
 while( true ){
 int x = sc.nextInt();
 if ( x < 0 ) break;
 // your code
 if (x == 0) {
                int popped = st.pop();
                if (popped != -1) { 
                    System.out.println(popped);
                }
            } else {
                st.push(x);
            }
 }
 }
}