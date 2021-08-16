package chapterFour;
//initialize number to zero
//initialize first largest number to zero
//initialize second largest number to zero
//initialize counter to one
// while counter is less than or equals to 10
//Ask the user to enter a number
//if number greater than first largest number
// Second largest number is equal to first largest number
//Then first largest number will equal to number
// else if number is greater than second largest number
//Second largest number is equal number



import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int numbers = 0;
        int firstLargestNumber = 0;
        int secondLargestNumber = 0;
        int count = 1;

        Scanner input = new Scanner(System.in);
        while(count <= 10){
            System.out.println("Enter a number "+ count +  ":");
            int number = input.nextInt();
            if (number > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = number;}
            else
            if (number > secondLargestNumber)
                secondLargestNumber = number;
            count++;
        }
        System.out.printf("First largest number is %d%n", firstLargestNumber);
        System.out.printf("Second largest number is %d", secondLargestNumber);
    }
}
