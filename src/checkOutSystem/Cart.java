package checkOutSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cart {
    private String ownerName;
    public ArrayList<Item> items = new ArrayList<>();
//    public  ArrayList<Cart> cart = new ArrayList<>();

    public Cart(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addItems(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        int total = 0;
        for (Item item : items) {
            total += item.calculateTotal();
        }
        return total;
    }
    public double calculateVatOfItems(double percentage) {

        return calculateTotalPrice() * (percentage / 100.0);
    }

    public double calculateTotalAfterAddVat()
    {

        return calculateTotalPrice() + calculateVatOfItems(7.25);
    }
    public double balanceAfterPayment(double moneyPaid)
    {

        return moneyPaid - calculateTotalAfterAddVat();
    }

    public String dateAndTime()
    {
        LocalDateTime datetime1 = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return datetime1.format(format);
    }

    @Override
    public String toString() {
        StringBuilder stringToReturn = new StringBuilder();
        for (Item item : items){
            stringToReturn.append(item.toString());
        }
        return stringToReturn.toString();
    }
}
