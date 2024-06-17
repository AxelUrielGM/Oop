import java.util.Scanner;

public class PostalSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect sender information
        System.out.println("Enter sender details:");
        User sender = collectUserDetails(scanner);

        // Collect recipient information
        System.out.println("\nEnter recipient details:");
        User recipient = collectUserDetails(scanner);

        // Determine if sending a letter or a package
        System.out.print("\nIs this a letter or a package? (Enter 'letter' or 'package'): ");
        String type = scanner.nextLine();

        Package item;
        if (type.equalsIgnoreCase("letter")) {
            item = new Letter(sender, recipient);
        } else if (type.equalsIgnoreCase("package")) {
            // Collect package details (weight and content)
            System.out.print("Enter weight of the package (in kg): ");
            double weight = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter content description: ");
            String content = scanner.nextLine();

            item = new MailItem(sender, recipient, weight, content);
        } else {
            System.out.println("Invalid choice. Please enter 'letter' or 'package'.");
            return;
        }

        // Calculate and display price and estimated arrival time
        System.out.println("\nCalculating...");
        double price = item.estimatePrice();
        System.out.printf("Estimated cost: $%.2f USD\n", price);

        System.out.println("Estimated arrival time: " + item.getEstimateArrival());

        scanner.close();
    }

    private static User collectUserDetails(Scanner scanner) {
        try {
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();
            validateAddress(address);

            System.out.print("Phone Number (+52xxxxxxxxxx): ");
            String phoneNumber = scanner.nextLine();
            validatePhoneNumber(phoneNumber);

            System.out.print("Email: ");
            String email = scanner.nextLine();
            User user = new User(fullName, address, phoneNumber, email);
            user.setEmail(email);
            return user;
        } catch (UserException e) {
            System.out.println(e.getMessage());
            return collectUserDetails(scanner);
        }
    }

    private static void validatePhoneNumber(String phoneNumber) throws UserException {
        if (!phoneNumber.matches("\\+52\\d{10}")) {
            throw new UserException("Invalid phone number format. Must start with +52 and have 10 digits.");
        }
    }

    private static void validateEmail(String email) throws UserException {
        if (!email.matches("[a-zA-Z0-9._%+-]+@gmail.com")) {
            throw new UserException("Invalid email format. Please use a @gmail.com email.");
        }
    }

    private static void validateAddress(String address) throws UserException {
        if (!address.matches("(?i).*\\b(OAX|QROO|MOR|QRO|SIN)\\b.*")) {
            throw new UserException("Invalid address format. Must contain state code (OAX, QROO, MOR, QRO, SIN).");
        }
    }
}
