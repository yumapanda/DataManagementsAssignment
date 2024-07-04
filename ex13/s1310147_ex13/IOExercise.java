import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

class IOExercise {
    IOExercise() {
        DataOutputStream out = null;
        DataInputStream in = null;
        try {
            System.out.println("Enter the number: ");
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(is);
            double x = Double.parseDouble(bf.readLine());
            double s1 = Math.sqrt(x);
            System.out.println("Square root of " + x + " is " + s1);
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("number.data")));
            out.writeDouble(s1);
            out.close();
            System.out.println("The square root value " + s1 + " is written to the file \"number.data\".");
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("number.data")));
            double s2 = in.readDouble();
            System.out.println("The value read from the file \"number.data\": " + s2);
            System.out.println("Square of " + s2 + " is " + s2 * s2);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new IOExercise();
    }
}
