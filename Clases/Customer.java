public class Customer {
    private String name;
    private int customerId;
    private int phoneNumber;
    private String address;
    private String email;
    private String type;

    public Customer(String name, int customerId, int phoneNumber, String address, String email, String type) {
        this.name = name;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateProfile(String name, String address) {
        this.setName(name);
        this.address = address;
    }

    public void contactSupport() {
        System.out.println("Contacting support via email: " + this.email);
    }

    // Additional behavior
    public void printCustomerDetails() {
        System.out.println("Customer ID: " + this.customerId + "\nName: " + this.name + "\nType: " + this.type);
    }
    
    public void changeCustomerType(String newType) {
        this.type = newType;
        System.out.println("Customer type updated to: " + this.type);
    }
}
