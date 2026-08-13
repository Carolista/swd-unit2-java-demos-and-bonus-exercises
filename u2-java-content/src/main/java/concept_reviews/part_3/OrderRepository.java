package concept_reviews.part_3;

import java.io.FileNotFoundException;

class OrderRepository {
    // Low-level method: Throws a CHECKED exception (must be declared with 'throws')
    public void loadOrderFile(String filename) throws FileNotFoundException {
        if (!filename.endsWith(".json")) {
            throw new FileNotFoundException("File not found or invalid format: " + filename);
        }
        System.out.println("[Repository] File loaded successfully: " + filename);
    }
}
