package chapterThree;

public class Account {
    private int balance;

    public void deposit(int amountToDeposit) {
        //  balance = amountToDeposit;
        if (amountToDeposit > 0) {
            balance = balance + amountToDeposit;
        }
    }

    public int getBalance() {

        return balance;
    }


    public void withdraw(int amountToWithdraw, int pin) {
        if (pin == 1234) {
            if (amountToWithdraw <= balance) {
                balance = balance - amountToWithdraw;

            }
        }


    }
}
