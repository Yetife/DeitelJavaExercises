package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void accountCanDepositTest(){
        //given
        Account yetundeAccount = new Account();
        //when
        yetundeAccount.deposit(150);
        //check
        int yetundeBalance = yetundeAccount.getBalance();
        assertEquals(150,yetundeBalance);

    }


    @Test
    void amountCannotTakeNegativeTest(){
        // given
        Account isrealAccount = new Account();
        //when
        isrealAccount.deposit(10_000);
        isrealAccount.deposit(-2_000);
        //assert
      int isrealBalance = isrealAccount.getBalance();
        assertEquals(8_000,10_000,isrealBalance);

    }
    @Test
            public void accountCanWithdrawTest(){
            Account goodnewsAccount = new Account();
            // when
        goodnewsAccount.deposit(10_000);
        goodnewsAccount.withdraw(2_000, 1234);
            //assert
       int goodnewsBalance = goodnewsAccount.getBalance();
            assertEquals(8_000,10_000,goodnewsBalance);
        }

       @Test
   public void accountCannotWithdrawWithPin(){
        // given
          Account goodnewsAccount = new Account();
          goodnewsAccount.deposit( 10_000);
          // when
            goodnewsAccount.withdraw( 3_000, 2254);
            // assert
            assertEquals(10_000, goodnewsAccount.getBalance());


   }
}