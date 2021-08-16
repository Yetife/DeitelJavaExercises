package chapterFour;

import java.util.Scanner;

// initialize counter to zero
// while counter less then or equals to number


public class PrimeNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number = 0;

         System.out.println("Enter a prime number: ");
        number = input.nextInt();

        for (int counter = 2; counter < number; counter++){
            if(number % counter == 0){
                System.out.println("It is not a prime number");
                System.exit(1);
            }
            else {
                System.out.println("It is a prime number");
            }
           // counter++;
        }
    }
}
