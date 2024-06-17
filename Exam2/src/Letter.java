import java.time.LocalDateTime;

public class Letter extends Package {

    public Letter(User sender, User recipient) {
        super(sender, recipient);
    }

    @Override
    public double estimatePrice() {
        // Price for sending a letter (assuming 1 kg cost)
        return 1.0; // USD
    }

    @Override
    public LocalDateTime getEstimateArrival() {
        // Estimate arrival time for letters
        return LocalDateTime.now().plusHours(24);
    }
}

