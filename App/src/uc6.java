import java.util.HashMap;
import java.util.Map;

public class uc6 {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashMap (Bogie → Capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 3: Insert Bogie Capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Step 4: Display Mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " seats");
        }

        // Step 5: Continue program
        System.out.println("\nCapacity mapping completed successfully!");
    }
}