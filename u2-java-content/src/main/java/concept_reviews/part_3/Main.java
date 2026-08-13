package concept_reviews.part_3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        // Test 1: Happy Path
        System.out.println("--- Test 1: Valid Order ---");
        try {
            service.processOrder("ORD-1001", "order.json");
            System.out.println("[Main] Test 1 try - Order completed successfully.");
        } catch (Exception e) {
            System.err.println("[Main] Test 1 catch - Unexpected error: " + e.getMessage());
        }

        // Test 2: Unchecked Exception (InvalidOrderException)
        System.out.println("\n--- Test 2: Unchecked Exception (Invalid Order ID) ---");
        try {
            service.processOrder("", "order.json");
        } catch (InvalidOrderException e) {
            System.out.println("[Main] Test 2 catch - Validation Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            // Required by compiler because OrderRepository processOrder method declares
            //  'throws FileNotFoundException' and OrderService class bubbles it up
            System.out.println("[Main] Test 2 catch - System Error: " + e.getMessage());
        }

        // Test 3: Checked Exception Bubbling (FileNotFoundException) & Finally Block
        System.out.println("\n--- Test 3: Checked Exception Bubbling (File Not Found) ---");
        try {
            // Exception originates in OrderRepository, bubbles through OrderService, caught here in Main
            service.processOrder("ORD-1002", "bad_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("[Main] Test 3 catch - System Error: " + e.getMessage());
        } finally {
            System.out.println("[Main] Test 3 finally - Resource cleanup completed.");
        }
    }
}
