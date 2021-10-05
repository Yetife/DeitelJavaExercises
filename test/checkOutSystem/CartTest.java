package checkOutSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    public void cartTest()
    {
        //    given
        Cart cart = new Cart("Yetunde");
        assertEquals(0, (cart.items).size());
        Item item = new Item("Pampers", 230, 4);
        cart.addItems(item);
        assertEquals(1, (cart.items).size());

    }
@Test
    public void calculateTotalPriceTest()
    {
//        given
        Cart cart = new Cart("Kim");
        assertEquals(0, (cart.items).size());
        Item item = new Item("Pampers", 100, 4);
        cart.addItems(item);
        assertEquals(1, (cart.items).size());
        Item item2 = new Item("Pampers", 100, 4);
        cart.addItems(item2);
        assertEquals(2, (cart.items).size());
        assertEquals(800, cart.calculateTotalPrice());
    }

}