package checkOutSystem;

public class Item {
    private  String itemName;
    private  double price;
    private int quantity;

    public Item(String itemName, double price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal()
    {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return itemName + "\t\t" + price + "\t\t\t" + quantity + "\t\t\t" + calculateTotal() + "\n";
    }
}
