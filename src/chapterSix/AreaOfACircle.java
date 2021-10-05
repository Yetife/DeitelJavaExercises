package chapterSix;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter radius of a circle");
        int radius = userInput.nextInt();

        System.out.println(circleArea(radius));
    }

    private static double circleArea(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }


}
