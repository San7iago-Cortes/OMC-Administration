import java.util.Date;

public class Order {
    private int orderId;
    private String status;
    private Date date;

    public Order(int orderId, String status, Date date) {
        this.orderId = orderId;
        this.status = status;
        this.date = date;
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
