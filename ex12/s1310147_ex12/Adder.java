public class Adder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided. Enter some numbers.");
            return;
        }
        int sum = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + ". Enter only integers.");
                return;
            }
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
