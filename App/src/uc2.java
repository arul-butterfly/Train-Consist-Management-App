import java.util.ArrayList;
import java.util.List;

public class uc2 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display Bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 5: Remove a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 6: Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 7: Check existence of Sleeper
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Step 8: Final List State
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);

        // Step 9: Continue program
        System.out.println("\nProgram continues...");
    }
}