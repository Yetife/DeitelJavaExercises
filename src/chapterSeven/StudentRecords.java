package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class StudentRecords<total> {
    public static int numberOfStudent;
    public static int numberOfSubject;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many student score do you want to record?");
        int numberOfStudent = input.nextInt();
        System.out.println("How many subject do they offer?");
        int numberOfSubject = input.nextInt();
        int[][] studentRecords = new int[numberOfStudent][numberOfSubject];

        for(int row = 0; row < numberOfStudent;row++){
            System.out.println("Enter scores for student" + (row +1));
            for(int column = 0; column < numberOfSubject; column++){
                System.out.println("Enter student score for subject " + (column +1));
                int scores = input.nextInt();
                studentRecords[row][column] = scores;
            }
        }
        displayStudentTable(studentRecords);
        System.out.println();
        displayStudentScores(studentRecords);
        System.out.println("Total is: " + Arrays.toString(calculateTotal(studentRecords)));
        System.out.println("Average is: " + Arrays.toString(calculateAverage(studentRecords)));
        System.out.println("Miximum number is: " + calculateHighestScore(studentRecords));
      //  System.out.printf("Maximum number is", calculateHighestScore(studentRecords));
    }

    public static void displayStudentTable(int[][] records)
    {
       // System.out.println("\n".repeat(3) + "TABLE SHOWING THE SCORES OF STUDENT FOR EACH SUBJECT");
            for (int column = 0; column < records[0].length; column++) {
                System.out.print("\t" + "Subject" + (column + 1));
            }
            for (int column = 0; column < 1; column++){
                System.out.printf("\t%s\t%s", "Total","Average");
            }
  }
    public static void displayStudentScores(int[][] records) {
        for (int row = 0; row < records.length; row++) {
            System.out.print("Student" + (row + 1) + ":" + "\t\t");
            for (int column = 0; column < records[row].length; column++) {
                System.out.print(records[row][column] + "\t\t");
                System.out.print(" ");
            }
            System.out.println();
        }
//        for (int row = 0; row < records.length; row++) {
//            for (int column = 0; column < 1; column++) {
//                System.out.print();
//                System.out.print(" ");
//            }
       // }
    }
    public static int[] calculateTotal(int[][] records) {
        int[] totalStudent = new int[records.length];
        int total = 0;
        for (int row = 0; row < records.length; row++) {
            for (int column = 0; column < records[row].length; column++) {
                total +=  records[row][column];
                totalStudent[row] = total;
            }
            total = 0;
        }
        return totalStudent;
    }
public static double[] calculateAverage(int[][] records) {
    int[] totalStudent = new int[records.length];
    double[] averageStudent = new double[records.length];
    int[] total = calculateTotal(records);
    double average = 0;
    for (int row = 0; row < records.length; row++) {
        for (int column = 0; column < records[row].length; column++) {
            averageStudent[row] = (double) total[row]/ records[row].length;
        }
    }
    return averageStudent;
}
public static int calculateHighestScore(int[][] records)
{
    int maximumNumber = records[0][0];
    for (int[] record : records) {
        for (int grade : record) {
           // maximumNumber = Math.max(maximumNumber, column);
            if (grade > maximumNumber)
                maximumNumber = grade;
        }
    }
    return maximumNumber;
}
}