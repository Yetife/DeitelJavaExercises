package chapterFive;

import java.util.Scanner;

public class MysteryNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 1000);
      //  System.out.println(randomNumber);

        for(int number = 1; number != randomNumber; number++) {
            System.out.println("Guess a number between 1 and 1000");
           // System.out.println("You have five trial");
            int guessNumber = input.nextInt();

            if (randomNumber > guessNumber) {
                System.out.println("Too low. Try again.");
            } else if (randomNumber < guessNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulation. You guessed the number!");
                break;
            }
        }

    }
}
