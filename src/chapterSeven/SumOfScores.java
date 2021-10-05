package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfScores = input.nextInt();
        int[] scores = new int[numberOfScores];

        for (int i = 0; i < scores.length; i++){
            System.out.println("Enter a score");
            int numberOfGrade = input.nextInt();
            scores[i] = numberOfGrade;
        }
        System.out.println("Total is: " + calculateTotal(scores));
        System.out.println(Arrays.toString(scores));
        System.out.println("Maximum number is: " + calculateMaximumNumberOfNewArray(scores));
        System.out.println("Minimum number is: " + calculateMinimumNumberOfNewArray(scores));
        System.out.println("Total is: " + Arrays.toString(calculateTotalOfNewArray(scores)));
    }

    public static int calculateTotal(int[] scores)
    {
        int total = scores[0];
        for (int i = 0; i < scores.length; i++){
            total +=scores[i];
        }
        return total;
    }

    public static int[] calculateTotalOfNewArray(int[] scores)
    {
        int total = calculateTotal(scores);
        int[] newArray = new int[scores.length];
        int newScore;
        for (int counter = 0; counter < scores.length;){
            for(int score : scores){
                newScore = calculateTotal(scores) - score;
                newArray[counter] = newScore;
                counter++;
            }
        }
        return newArray;
    }

    public static int calculateMaximumNumberOfNewArray(int[] scores)
    {   int[] newArray = calculateTotalOfNewArray(scores);
        int maximumNumber = newArray[0];
      for  (int counter = 0; counter < scores.length; counter++){
        maximumNumber = Math.max(maximumNumber,newArray[counter]);
    }
      return maximumNumber;
    }

    public static int calculateMinimumNumberOfNewArray(int[] scores) {
        int[] newArray = calculateTotalOfNewArray(scores);
        int minimumNumber = newArray[0];
        for (int counter = 0; counter < scores.length; counter++) {
            minimumNumber = Math.min(minimumNumber, newArray[counter]);
        }
        return minimumNumber;
    }
}
