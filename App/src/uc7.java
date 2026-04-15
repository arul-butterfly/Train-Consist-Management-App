import java.util.*;

// Step 1: Create Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display Method
    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class uc7 {
    public static void main(String[] args) {

        // Step 2: Create List to store bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 3: Add Passenger Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 4: Sort using Comparator (by capacity)
        Collections.sort(bogies, Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display Sorted Bogies
        System.out.println("Sorted Bogies by Capacity:\n");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}