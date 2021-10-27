package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class MysteryNumber {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        int randomNumber = (int) (Math.random() * 1000);
        //  System.out.println(randomNumber);
        guessANumber();
    }

        public static void guessANumber() {
            SecureRandom randomNumber = new SecureRandom();
            int numberValue = randomNumber.nextInt(1000);
            for (int number = 1; number <= 5; number++) {
                System.out.println("Guess a number between 1 and 1000");
                // System.out.println("You have five trial");
                if (guessNumberCondition(numberValue)) break;
            }
    }

    private static boolean guessNumberCondition(int numberValue) {
        int guessNumber = input.nextInt();

        if (numberValue > guessNumber) {
            System.out.println("Too low. Try again.");
        } else if (numberValue < guessNumber) {
            System.out.println("Too high. Try again.");
        } else {
            System.out.println("Congratulation. You guessed the number!");
            return true;
        }
        return false;
    }

}
