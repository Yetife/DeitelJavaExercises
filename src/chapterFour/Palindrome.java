package chapterFour;

import java.util.Scanner;

// initialize number to zero
// initialize number one to number five
//prompt user to input number
//while number is not greater than 10000 and less than or equal to 99999

public class Palindrome {
    public static void main(String[] args) {

        int number = 0, number1, number2, number3, number4, number5;
        Scanner input = new Scanner(System.in);


        while (!(number >= 10000) && (number <= 99999)) {
            System.out.println("Enter a five digit number: ");
             number = input.nextInt();

             number1 = (number/10000);
             number2 = (number % 10000)/1000;
             number3 = (number %1000)/100;
             number4 = (number %100)/10;
             number5 = (number %10)/1;



             if ((number1 == number5) && (number2 == number4)){
                 System.out.println("This is a palindrome");
             }
             else{
                 System.out.println("Error: ");
                 System.out.println("This is not a palindrome");
             }
        }
    }
}