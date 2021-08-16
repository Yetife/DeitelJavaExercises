package chapterFour;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args){

        int number = 0, firstNumber, secondNumber, thirdNumber, fourthNumber;
        int crypt;

        Scanner input = new Scanner(System.in);

        while(!(number >= 1000) && (number <= 9999)){
            System.out.println("Enter a four digit number: ");
            number = input.nextInt();

            firstNumber = number/1000;
            firstNumber = firstNumber + 7;

            secondNumber = (number % 1000)/100;
            secondNumber = secondNumber + 7;

            thirdNumber = (number % 100)/10;
            thirdNumber = thirdNumber + 7;

            fourthNumber = (number % 10)/1;
            fourthNumber = fourthNumber + 7;

            firstNumber = firstNumber % 10;
            secondNumber = secondNumber % 10;
            thirdNumber = thirdNumber % 10;
            fourthNumber = fourthNumber % 10;

            crypt = thirdNumber;
            thirdNumber = firstNumber;
            firstNumber = crypt;

            crypt = fourthNumber;
            fourthNumber = secondNumber;
            secondNumber = crypt;

            System.out.printf("The encrypt number is %d%d%d%d", firstNumber, secondNumber, thirdNumber, fourthNumber);

        }
    }


}
