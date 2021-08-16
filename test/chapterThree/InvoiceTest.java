package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {
    @Test
    public void invoiceHasPartNumber(){
        //given
        Invoice myInvoice = new Invoice();
        //when
        myInvoice.partNumber("2021JUL");
        //assert
        assertEquals("2021JUL", myInvoice.getPartNumber());
        //System.out.printf("Part number is %s", myInvoice.getPartNumber());
    }

    @Test
    public void invoiceHasPartDescription(){
        //given
        Invoice myInvoice = new Invoice();
        //when
        myInvoice.partDescription("Product 1");
        //assert
        assertEquals("Product 1", myInvoice.getPartDescription());
    }

    @Test
    public void invoiceHasItemQuantity(){
        // given
        Invoice myInvoice = new Invoice();
        //when
        myInvoice.itemQuantity(1);
        //assert
        assertEquals(1, myInvoice.getItemQuantity());
    }

    @Test
    public void invoiceMustNotHaveNegativeItemQuantity(){
        //given
        Invoice myInvoice = new Invoice();
        //when
        myInvoice.itemQuantity(-2);
        //assert
        assertEquals(0.0, myInvoice.getItemQuantity());
    }

    @Test
    public void invoiceHasPricePerItem(){
        //given
        Invoice myInvoice = new Invoice();
        // when
        myInvoice.pricePerItem(60.00);
        //assert
        assertEquals(60.00, myInvoice.getPricePerQuantity());
    }

    @Test
    public void invoiceMustNotHaveNegativePricePerItem(){
        //given
        Invoice myInvoice = new Invoice();
        //when
        myInvoice.pricePerItem(-30.00);
        assertEquals(0.0, myInvoice.getPricePerQuantity());
    }

    @Test
    public void invoiceAmount(){
        //given
        Invoice myInvoice = new Invoice();
        //when
        myInvoice.itemQuantity(2);
        myInvoice.pricePerItem(60.00);
        //assert
        assertEquals(120.00, myInvoice.getInvoiceAmount());

    }
}