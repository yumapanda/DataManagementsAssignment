import java.util.Scanner;

public class IteratorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SimpleList list = new SimpleList();

        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            if (command.equals("insert")) {
                int value = scanner.nextInt();
                list.insert(value);
            } else if (command.equals("delete")) {
                int value = scanner.nextInt();
                list.delete(value);
            }
        }

        Iterator forwardIterator = list.forwardIterator();
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }
        System.out.println();

        Iterator backwardIterator = list.backwardIterator();
        while (backwardIterator.hasNext()) {
            System.out.print(backwardIterator.next() + " ");
        }
        System.out.println();

        scanner.close();
    }
}
