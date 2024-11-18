public class Pay {
    private int payId;
    private Order order;
    private float amount;
    private String payMethod;

    public Pay(int payId, Order order, float amount, String payMethod) {
        this.payId = payId;
        this.order = order;
        this.amount = amount;
        this.payMethod = payMethod;
    }

    public boolean processPay() {
        System.out.println("Processing pay for Order ID: " + this.order.getOrderId());
        return true;
    }
}
