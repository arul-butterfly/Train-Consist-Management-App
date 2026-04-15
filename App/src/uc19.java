import java.util.Arrays;
import java.util.Scanner;

public class uc19 {

    // Method to perform Binary Search
    public static boolean binarySearch(String[] bogieIDs, String key) {

        int low = 0;
        int high = bogieIDs.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // Compare using compareTo()
            int result = key.compareTo(bogieIDs[mid]);

            if (result == 0) {
                return true; // Found
            }
            else if (result > 0) {
                low = mid + 1; // Search right half
            }
            else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIDs = new String[n];

        // Input bogie IDs
        System.out.println("Enter sorted bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIDs[i] = sc.nextLine();
        }

        // Ensure sorted (safety)
        Arrays.sort(bogieIDs);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIDs));

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Perform Binary Search
        boolean found = binarySearch(bogieIDs, key);

        // Output result
        if (found) {
            System.out.println("Bogie ID FOUND using Binary Search.");
        } else {
            System.out.println("Bogie ID NOT FOUND.");
        }

        sc.close();
    }
}