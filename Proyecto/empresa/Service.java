public class Service {
    private int serviceId;
    private String details;
    private String type;
    private Customer customer;

    public Service(int serviceId, String details, String type, Customer customer) {
        this.serviceId = serviceId;
        this.details = details;
        this.type = type;
        this.customer = customer;
    }

    public void assignEmployee(Employee employee) {
        System.out.println("Service " + this.details + " assigned to " + employee.getName());
    }

    public void updateServiceDetails(String newDetails) {
        this.details = newDetails;
        System.out.println("Service details updated to: " + this.details);
    }
}
