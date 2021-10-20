package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    @Test
    public void savingsAccountHasSavingsAccountTest()
    {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setSavingsBalance(1000.0);
        assertEquals(1000, savingsAccount.getSavingsBalance());
    }

    @Test
    public void calculateMonthlyInterestRateTest()
    {
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setSavingsBalance(3000);
        saver1.modifyInterestRate(0.04);
        assertEquals(10.0, saver1.calculateMonthlyInterestRate());
    }
}