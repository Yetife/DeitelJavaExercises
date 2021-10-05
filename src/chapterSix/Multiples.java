package chapterSix;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        System.out.println(isMultiple(firstNumber, secondNumber));

    }


    public static boolean isMultiple(int firstNumber, int secondNumber)
    {
        return secondNumber % firstNumber == 0;
    }
}


