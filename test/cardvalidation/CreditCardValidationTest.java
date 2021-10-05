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
    @Test
    public void totalSumOfDoubleEvenAndOddPlaceNumberTest()
    {
        assertEquals(90, creditCard.sumOfDoubleEvenAndOddPlaceNumber(5399834497239640L));
    }
    @Test
    public void testThatcardIsValid()
    {
        assertTrue(creditCard.isValid(5399834497239640L));
    }
    @Test
    public void validateLengthOfCardNumberTest()
    {
        assertThrows(IllegalArgumentException.class,() -> creditCard.validateLengthOfcardNumber(539983239640L));
    }
    @Test
    public void lengthOfCreditCardTest()
    {
        assertEquals(16, creditCard.getSize(5399834497239640L));

    }
}