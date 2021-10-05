package checkOutSystem;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    private static String ownersName = "";
    private static  Cart cart;
    private static double amountPaid;

    public static void main(String[] args) {
        setUpCart();
        addItems();
        displayInvoiceBeforePayment();
        customerMakePayment();
        displayInvoice();
    }

    public static void setUpCart()
    {
        System.out.println("What is your name");
      String cartOwnerName = input.nextLine();
      ownersName = cartOwnerName;
       cart = new Cart(cartOwnerName);
    }

    public static void addItem()
    {
        System.out.println("What did " + ownersName + " buy?\n");
        String itemName = input.next();
        System.out.println("How much does " + itemName + " cost?\n");
        int itemPrice = input.nextInt();
        System.out.println("How many " + itemName + " did " + ownersName + " buy?\n");
        int itemQuantity = input.nextInt();
        Item item = new Item(itemName, itemPrice, itemQuantity);
        cart.addItems(item);
    }

    public static void addItems()
    {
        String anyMoreItem = "Yes";
        while (anyMoreItem.equalsIgnoreCase("yes")){
            addItem();
            System.out.println("Any more item: ");
            anyMoreItem = input.next();
        }
    }

    public static void displayInvoiceBeforePayment()
    {
        System.out.println("=".repeat(50));
        System.out.println("Item" + "\t\t" + "Price" + "\t\t" + "Quantity" + "\t\t" + "Total");
        System.out.println("-".repeat(50));
        System.out.println(cart);
    }

    public  static void customerMakePayment()
    {
        System.out.println("Amount to be paid: " + cart.calculateTotalAfterAddVat());
        System.out.println("How much did " + ownersName + " pay");
        amountPaid = input.nextDouble();
    }
    public static void displayInvoice()
    {
        System.out.println(" TIFEH STORE\n Herbert Macaulay way\n Tel: +234-809-6393-031");
        System.out.println(" Date: " + cart.dateAndTime());
        System.out.println("=".repeat(50));
        System.out.println("Item" + "\t\t" + "Price" + "\t\t" + "Quantity" + "\t\t" + "Total");
        System.out.println("-".repeat(50));
        System.out.println(cart);
        System.out.println("-".repeat(50));
        System.out.println("Sub Total:  " + cart.calculateTotalPrice());
        System.out.printf("VAT @7.25%%: %.2f%n", cart.calculateVatOfItems(7.25));
        System.out.println("=".repeat(50));
        System.out.printf("Bill Total: %.2f%n" , cart.calculateTotalAfterAddVat());
        System.out.println("Amount paid: " + amountPaid);
        System.out.printf("Balance: %.2f%n" , cart.balanceAfterPayment(amountPaid));
        System.out.println("=".repeat(50));
        System.out.println("THANKS FOR YOUR PATRONAGE");
    }
}
