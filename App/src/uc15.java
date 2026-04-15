// Step 1: Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Step 2: Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Step 3: Cargo Assignment Method with Safety Check
    void assignCargo(String cargo) {
        try {
            // Rule: Rectangular → cannot carry Petroleum
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe: Rectangular bogie cannot carry Petroleum"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println(type + " bogie assigned with " + cargo);

        } catch (CargoSafetyException e) {
            // Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Assignment attempt completed.\n");
        }
    }

    void display() {
        System.out.println(type + " - Cargo: " + cargo);
    }
}

// Step 4: Main Class
public class uc15 {
    public static void main(String[] args) {

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Step 5: Safe Assignment
        b1.assignCargo("Petroleum");

        // Step 6: Unsafe Assignment (handled safely)
        b2.assignCargo("Petroleum");

        // Step 7: Program continues
        System.out.println("Final Bogie States:\n");
        b1.display();
        b2.display();
    }
}