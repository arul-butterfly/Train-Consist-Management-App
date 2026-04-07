import java.util.LinkedList;

public class uc4 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // Step 3: Add Bogies (Initial Order)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Step 4: Display Initial Train
        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Step 5: Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        // Step 6: Display after insertion
        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(train);

        // Step 7: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Step 8: Final Train Consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);

        // Step 9: Continue program
        System.out.println("\nTrain sequence maintained successfully!");
    }
}