package chapterSix;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        System.out.println(isEven(number));
    }

    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }
}
