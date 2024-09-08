public class Service {
    private int serviceId;
    private String details;
    private String type;
    private int customerId;

    public Service(int serviceId, String details, String type, int customerId) {
        this.serviceId = serviceId;
        this.details = details;
        this.type = type;
        this.customerId = customerId;
    }

    public void assignEmployee(Employee employee) {
        System.out.println("Service " + this.details + " assigned to " + employee.getName());
    }

    public void updateServiceDetails(String newDetails) {
        this.details = newDetails;
        System.out.println("Service details updated to: " + this.details);
    }
}
