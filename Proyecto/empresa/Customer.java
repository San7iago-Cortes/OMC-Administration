import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int customerId;
    private int phoneNumber;
    private String address;
    private String email;
    private String type;
    private List<Order> orders;
    private List<Service> services;

    public Customer(String name, int customerId, int phoneNumber, String address, String email, String type) {
        this.name = name;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.type = type;
        this.orders = new ArrayList<>();
        this.services = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public void updateProfile(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void contactSupport() {
        System.out.println("Contacting support via email: " + this.email);
    }

    public void printCustomerDetails() {
        System.out.println("Customer ID: " + this.customerId + "\nName: " + this.name + "\nType: " + this.type);
    }

    public void changeCustomerType(String newType) {
        this.type = newType;
        System.out.println("Customer type updated to: " + this.type);
    }
}
