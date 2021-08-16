package chapterFour;

import java.util.Scanner;

public class FourPointTwoNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Side of a Square between 1 and 20");
        int number = input.nextInt();

                for (int count = 1; count < number; count++) {
                    System.out.print("* ");
                }

            for (int counter = 2; counter <= number; counter++) {
                for (int count1 = 2; count1 <= number; count1++) {
                    if (count1 == 2 || count1 == number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
                for (int count2 = 1; count2 <= number; count2++) {
                    System.out.print("* ");
                }
    }
}