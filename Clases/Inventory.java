public class Inventory {
    private int itemId;
    private String itemName;
    private int stockQuantity;
    private int unitPrice;
    private String category;
    private String itemLocation;

    public Inventory(int itemId, String itemName, int stockQuantity, int unitPrice, String category, String itemLocation) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
        this.category = category;
        this.itemLocation = itemLocation;
    }

    public void addItem(int quantity) {
        this.stockQuantity += quantity;
        System.out.println(quantity + " units of " + this.itemName + " added to inventory.");
    }

    public void removeItem(int quantity) {
        this.stockQuantity -= quantity;
        System.out.println(quantity + " units of " + this.itemName + " removed from inventory.");
    }
}
