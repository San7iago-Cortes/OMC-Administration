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
        System.out.println(this.name + " has received an order.");
    }

    public void updateEmployeeRole(String newRole) {
        this.role = newRole;
        System.out.println(this.name + "'s role updated to " + this.role);
    }
}
