package cardvalidation;

import java.util.Scanner;

public class MainCardvalidation {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        CreditCardValidation creditCard = new CreditCardValidation();
        System.out.println("Enter your card number");
        long cardNumber = input.nextLong();
        creditCard.sumOfDoubleEvenPlace(cardNumber);
        creditCard.sumOfOddPlace(cardNumber);
//        creditCard.sumOfDoubleEvenAndOddPlaceNumber();


    }
}
