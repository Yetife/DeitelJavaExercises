package checkOutSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    public void caiculateTotalTest()
    {
//        given
        Item item = new Item("coke", 150, 2);
        assertEquals(300, item.calculateTotal());
    }

}