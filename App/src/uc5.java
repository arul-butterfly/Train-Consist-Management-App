import java.util.LinkedHashSet;

public class uc5 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet for Train Formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 3: Add Bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 4: Attempt to add duplicate
        train.add("Sleeper"); // Duplicate (will be ignored)

        // Step 5: Display Train Formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(train);

        // Step 6: Continue program
        System.out.println("\nDuplicate bogies are not allowed!");
    }
}