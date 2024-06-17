public class User {
    private String fullName;
    private String address;
    private String phoneNumber;
    private String email;

    public User(String fullName, String address, String phoneNumber, String email) throws UserException {
        setFullName(fullName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws UserException {
        if (!address.matches("(?i).*\\b(OAX|QROO|MOR|QRO|SIN)\\b.*")) {
            throw new UserException("Invalid address format. Must contain state code (OAX, QROO, MOR, QRO, SIN).");
        }
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws UserException {
        if (!phoneNumber.matches("\\+52\\d{10}")) {
            throw new UserException("Invalid phone number format. Must start with +52 followed by 10 digits.");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws UserException {
        if (!email.matches("[a-zA-Z0-9._%+-]+@gmail.com")) {
            throw new UserException("Invalid email format. Please use a @gmail.com email.");
        }
        this.email = email;
    }
}
