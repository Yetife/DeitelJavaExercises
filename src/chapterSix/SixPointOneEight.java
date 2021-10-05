package chapterSix;

import java.util.Scanner;

public class SixPointOneEight {
    public static void main(String[] args) {
        printAsteric();

    }

    public static void printAsteric()
    {   Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int row = 1; row <= number; row++ ){
            for (int column = 1; column <= number; column++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
