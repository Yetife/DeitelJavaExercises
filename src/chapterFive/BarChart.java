package chapterFive;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int fourthNumber = input.nextInt();
        int fifthNumber = input.nextInt();

        if (firstNumber <= 30) {
            for (int count = 1; count <= firstNumber; count++) {
                System.out.print("*"); }
         System.out.println(" ");}
        else {
            System.out.println("Enter a valid number");
        }
        if (secondNumber <= 30) {
            for (int count = 1; count <= secondNumber; count++) {
                System.out.print("*");
            } System.out.println(" ");
        } else {
            System.out.println("Enter a valid number");
        }
        if (thirdNumber <= 30) {
            for (int count = 1; count <= thirdNumber; count++){
                System.out.print("*");
        } System.out.println(" ");
    }else{
        System.out.println("Enter a valid number");
    }
        if (fourthNumber <= 30) {
            for (int count = 1; count <= fourthNumber; count++) {
                System.out.print("*");
            } System.out.println(" ");
        }else{
            System.out.println("Enter a valid number");
        }
        if (fifthNumber <= 30) {
            for (int count = 1; count <= fifthNumber; count++) {
                System.out.print("*");
            }System.out.println(" ");
        }
        else{
            System.out.println("Enter a valid number");
        }
    }
}
