package cardvalidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import segmentDisplay.SevenSegmentDisplay;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationTest {
    CreditCardValidation creditCard;
    @BeforeEach
    public void beforeEach()
    {
        creditCard = new CreditCardValidation();
    }

    @Test
    public void sumOfDoubleEvenPlaceTest()
    {

        assertEquals(55, creditCard.sumOfDoubleEvenPlace(5399834497239640L));
    }

    @Test
    public void sumOfOddPlaceTest()
    {
        assertEquals(35, creditCard.sumOfOddPlace(5399834497239640L));
    }
}