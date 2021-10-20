package chapterEight;

public class SavingsAccount {
    public static double annualInterestRate = 0;
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance + calculateMonthlyInterestRate();
    }

    public double calculateMonthlyInterestRate()
    {
        double monthlyInterest= 0;
        for (int i = 0; i < 12; i++) {
            monthlyInterest = (savingsBalance  * annualInterestRate)/12;
//            savingsBalance = savingsBalance + monthlyInterest;
        }
        return monthlyInterest;
    }

    public void modifyInterestRate(double annualInterestRate)
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}

class MainSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setSavingsBalance(2000);
        calculateMonthlyInterestRateFor12Month();


    }

    public static void calculateMonthlyInterestRateFor12Month(){
       int month = 12;
        for (int i = 0; i < month; i++) {
            SavingsAccount saver1 = new SavingsAccount();
            saver1.setSavingsBalance(2000);
            saver1.modifyInterestRate(0.04);
            System.out.println(saver1.calculateMonthlyInterestRate());
        }
    }
}
