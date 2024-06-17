import java.time.LocalDateTime;

public class MailItem extends Package {
    private double weight;
    private String content;

    public MailItem(User sender, User recipient, double weight, String content) {
        super(sender, recipient);
        this.weight = weight;
        this.content = content;
    }

    public double getWeight() {
        return weight;
    }

    public String getContent() {
        return content;
    }

    @Override
    public double estimatePrice() {
        DistributionPoints destination = getDestination();
        if (destination == null) {
            System.out.println("Destination not allowed. Package cannot be sent.");
            return 0.0;
        }
        double baseCost = destination.getCostPerKgUSD() * weight;
        return baseCost;
    }

    @Override
    public LocalDateTime getEstimateArrival() {
        DistributionPoints destination = getDestination();
        if (destination == null) {
            return null;
        }
        return LocalDateTime.now().plusHours((long) destination.getArrivalTimeHours());
    }

    private DistributionPoints getDestination() {
        String recipientAddress = getRecipient().getAddress();
        for (DistributionPoints point : DistributionPoints.values()) {
            if (recipientAddress.contains(point.getCode())) {
                return point;
            }
        }
        return null;
    }
}
