import java.util.Date;

public class Order {
    private int orderId;
    private String status;
    private Date date;
    private Customer customer;

    public Order(int orderId, String status, Date date, Customer customer) {
        this.orderId = orderId;
        this.status = status;
        this.date = date;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void updateOrderStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order status updated to: " + this.status);
    }

    public void postponeOrder(Date newDate) {
        this.date = newDate;
        System.out.println("Order postponed to: " + this.date);
    }
}
