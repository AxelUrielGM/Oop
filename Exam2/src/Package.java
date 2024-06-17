import java.time.LocalDateTime;

public abstract class Package {
    private User sender;
    private User recipient;

    public Package(User sender, User recipient) {
        this.sender = sender;
        this.recipient = recipient;
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public abstract double estimatePrice();

    public abstract LocalDateTime getEstimateArrival();
}
