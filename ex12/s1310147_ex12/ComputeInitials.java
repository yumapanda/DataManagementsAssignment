public class ComputeInitials {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ComputeInitials \"Name\"");
            return;
        }
        
        String name = args[0];
        String[] parts = name.split("\\s+");

        StringBuilder initials = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0));
            }
        }

        System.out.println("My initials are: " + initials.toString().toUpperCase());
    }
}
