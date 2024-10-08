public class Employee {
    private int employeeId;
    private String name;
    private int phoneNumber;
    private String role;
    private String email;

    public Employee(int employeeId, String name, int phoneNumber, String role, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.email = email;
    }

    public void receiveOrder(Order order) {
        System.out.println(this.name + " has received an new order.");
    }

    public void updateEmployeeRole(String newRole) {
        this.role = newRole;
        System.out.println("The role of " + this.name + " has updated to " + this.role);
    }
}
