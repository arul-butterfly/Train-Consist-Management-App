// Step 1: Create Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class uc14 {
    public static void main(String[] args) {

        try {
            // Step 3: Create Valid Bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            // Step 4: Create Invalid Bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            b2.display(); // won't execute

        } catch (InvalidCapacityException e) {
            // Step 5: Handle Exception
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}