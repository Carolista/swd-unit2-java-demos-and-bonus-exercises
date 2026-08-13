package concept_reviews.part_3;

import java.io.FileNotFoundException;

class OrderService {
    private OrderRepository repository = new OrderRepository();

    // Middle-layer method: Does NOT catch FileNotFoundException; lets it "bubble up"
    public void processOrder(String orderId, String filename) throws FileNotFoundException {
        // 1. Validate input (Unchecked Exception: RuntimeException)
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new InvalidOrderException("Order ID cannot be empty.");
        }

        System.out.println("[Service] Processing order " + orderId + "...");

        // 2. Delegate to repository (Checked Exception bubbles up through here)
        repository.loadOrderFile(filename);
    }
}
