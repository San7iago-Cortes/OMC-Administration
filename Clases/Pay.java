public class Pay {
    private int payId;
    private int orderId;
    private float amount;
    private String payMethod;

    public Pay(int payId, int orderId, float amount, String payMethod) {
        this.payId = payId;
        this.orderId = orderId;
        this.amount = amount;
        this.payMethod = payMethod;
    }

    public boolean processPay() {
        System.out.println("Processing pay for Order ID: " + this.orderId);
        return true;
    }
}
