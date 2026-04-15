import java.util.Scanner;

public class uc18 {

    // Method to perform Linear Search
    public static boolean linearSearch(String[] bogieIDs, String key) {

        // Traverse array sequentially
        for (int i = 0; i < bogieIDs.length; i++) {

            // Compare using equals()
            if (bogieIDs[i].equals(key)) {
                return true; // Match found
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIDs = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Perform search
        boolean found = linearSearch(bogieIDs, key);

        // Display result
        if (found) {
            System.out.println("Bogie ID FOUND in the train consist.");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        sc.close();
    }
}