package chapterSix;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");

            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            double number3 = input.nextDouble();
            System.out.println("Minimum is " + calculateMinimumOfThreeNumbers(number1, number2, number3));

        }


    public static double calculateMinimumOfThreeNumbers(double a, double b, double c)
    {
        return Math.min(a, Math.min(b, c));
    }
}
