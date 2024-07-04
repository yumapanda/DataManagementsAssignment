import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        
        int q = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < q; i++) {
            String[] command = scanner.nextLine().split(" ");
            String operation = command[0];
            int a = Integer.parseInt(command[1]);
            int b = Integer.parseInt(command[2]);
            
            if (operation.equals("print")) {
                System.out.println(str.substring(a, b + 1));
            } else if (operation.equals("reverse")) {
                str = reverseSubstring(str, a, b);
            } else if (operation.equals("replace")) {
                String replacement = command[3];
                str = replaceSubstring(str, a, b, replacement);
            }
        }
        
        scanner.close();
    }
    
    private static String reverseSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder(str.substring(start, end + 1));
        return str.substring(0, start) + sb.reverse() + str.substring(end + 1);
    }
    
    private static String replaceSubstring(String str, int start, int end, String replacement) {
        return str.substring(0, start) + replacement + str.substring(end + 1);
    }
}
