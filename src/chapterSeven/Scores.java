package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
       // int numberOfGrades = scores.length;
        for(int counter = 0; counter < 10; counter++){
            System.out.println("Enter score");
            int grade = input.nextInt();
            scores[counter] = grade;
        }
        System.out.printf("SmallesNumber is %d%n", calculateSmallestNumber(scores));
        System.out.printf("LargestNumber is %d%n", calculateLargestNumber(scores));
        System.out.printf("Total is %d%n", calculateTotal(scores));
        System.out.printf("Average is %f%n", calculateAverage(scores));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(calculateSum(scores)));
        System.out.printf("Minimum number of total is %d%n", calculateMinimumOfSumTotal(scores));
        System.out.printf("Maximum number of total is %d%n", calculateMaximumOfSumTotal(scores));
    }

    public static int calculateSmallestNumber(int[] scores) {
        int smallestNumber = scores[0];
        for (int counter = 0; counter < scores.length; counter++) {
            smallestNumber = Math.min(smallestNumber, scores[counter]);
        }
        return smallestNumber;
    }
    public static int calculateLargestNumber(int[] scores) {
        int largestNumber = scores[0];
        for (int counter = 0; counter < scores.length; counter++) {
            largestNumber = Math.max(largestNumber, scores[counter]);
        }
        return largestNumber;
    }

    public static int calculateTotal(int[] scores)
    {
        int totalNumber = scores[0];
        for (int counter = 0; counter < scores.length; counter++){
            totalNumber += scores[counter];
        }
        return totalNumber;
    }

    public static double calculateAverage(int[] scores)
    {
        double averageNumber = scores[0];
        for (int counter = 0; counter < scores.length; counter++){
            averageNumber = (double) calculateTotal(scores) / scores.length;
        }
        return averageNumber;
    }

    public static int calculateMinimumOfSumTotal(int[] scores)
    {
        int minimumNumberOfSum = scores[0];
        for (int counter = 0; counter < scores.length; counter++){
            minimumNumberOfSum = calculateTotal(scores) - calculateLargestNumber(scores);
        }
        return minimumNumberOfSum;
    }

    public static int calculateMaximumOfSumTotal(int[] scores)
    {
        int maximumNumberOfSum = scores[0];
        for (int counter = 0; counter < scores.length; counter++){
            maximumNumberOfSum = calculateTotal(scores) - calculateSmallestNumber(scores);
        }
        return maximumNumberOfSum;
    }

    public static int[] calculateSum(int[] scores)
    {  int total = calculateTotal(scores);
        int[] newScores = new int[scores.length];
        int newScore;
        for (int counter = 0; counter < scores.length; ){
            for(int score : scores){
                newScore = calculateTotal(scores) - score;
              newScores[counter] = newScore;
                counter++;
            }
        }
        return newScores;
    }
}
