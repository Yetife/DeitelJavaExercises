package chapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double pricePerItem;


    public void partNumber(String partNumber) {
       this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void partDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void itemQuantity(int itemQuantity) {
        if (itemQuantity > 0.0) {
            this.itemQuantity = itemQuantity;
        }
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void pricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getPricePerQuantity() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return itemQuantity * pricePerItem;
    }
}
