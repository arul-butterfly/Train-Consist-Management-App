import java.util.*;
import java.util.stream.*;

// Step 1: Bogie Class
class Bogie {
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

public class uc10 {
    public static void main(String[] args) {

        // Step 2: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)              // Extract capacity
                .reduce(0, Integer::sum);          // Sum all values

        // Step 4: Display Total
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Step 5: Original List (unchanged)
        System.out.println("\nOriginal Bogies:\n");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}