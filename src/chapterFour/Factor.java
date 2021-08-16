package chapterFour;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        int counter = 1;

        System.out.println("Enter a number: ");
        number = input.nextInt();
        System.out.printf("Factors of %d are: ", number);
        while (counter <= number) {

           if (number % counter == 0)
                System.out.printf("%d ", counter);
            counter++;
        }
    }
}