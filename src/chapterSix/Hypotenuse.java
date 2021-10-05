package chapterSix;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
       System.out.println("Side1 = " +calculateSideOneOfATriangle(3.0));
       System.out.println("Side2 = " +calculateSideTwoOfATriangle(5.0));
        System.out.printf("Hypotenuse = %.2f%n", calculateHypotenuseOfATriangle(3.0, 5.0));

        System.out.println(calculateSideOneOfATriangle(2.0));
        System.out.println(calculateSideTwoOfATriangle(4.0));
        System.out.printf("Hypotenuse = %.2f%n", calculateHypotenuseOfATriangle(2.0, 4.0));
    }


public static double calculateSideOneOfATriangle(double side1) {
     return Math.pow(side1, 2);
}

    public static double calculateSideTwoOfATriangle(double side2) {

        return Math.pow(side2, 2);
    }

    public static double calculateHypotenuseOfATriangle(double side1, double side2) {
//        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return Math.sqrt(calculateSideOneOfATriangle(side1) + calculateSideTwoOfATriangle(side2));
    }
}
