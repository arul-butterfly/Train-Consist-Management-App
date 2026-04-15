import java.util.Scanner;

public class uc20 {

    // Method to perform Linear Search with validation
    public static boolean searchBogie(String[] bogieIDs, String key) {

        // ✅ Defensive check (Fail-Fast)
        if (bogieIDs == null || bogieIDs.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Search operation cannot be performed.");
        }

        // Linear Search
        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIDs;

        // Initialize array based on user input
        if (n > 0) {
            bogieIDs = new String[n];

            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIDs[i] = sc.nextLine();
            }
        } else {
            bogieIDs = new String[0]; // Empty train
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIDs, key);

            if (found) {
                System.out.println("Bogie ID FOUND.");
            } else {
                System.out.println("Bogie ID NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            // Handle runtime exception
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}