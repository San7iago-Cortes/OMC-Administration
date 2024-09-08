public class Owner extends Employee {

    public Owner(int employeeId, String name, int phoneNumber, String email) {
        super(employeeId, name, phoneNumber, "Owner", email);
    }

    public void assignTask(Employee employee, String task) {
        System.out.println("Assigning " + task + " to " + employee.getName());
    }

    public void payEmployee(Employee employee, double amount) {
        System.out.println("Paying " + amount + " to " + employee.getName());
    }
}
