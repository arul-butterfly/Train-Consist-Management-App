import java.util.*;
import java.util.stream.*;

// Step 1: Bogie Class (same as UC7)
class uc8 {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class uc8 {
    public static void main(String[] args) {

        // Step 2: Create List (Original Data)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Apply Stream Filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 4: Display Filtered Bogies
        System.out.println("Filtered Bogies (Capacity > 60):\n");

        for (Bogie b : filteredBogies) {
            b.display();
        }

        // Step 5: Show Original List (unchanged)
        System.out.println("\nOriginal Bogies List:\n");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}