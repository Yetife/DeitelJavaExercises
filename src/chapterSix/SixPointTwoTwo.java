package chapterSix;

import java.util.Scanner;

public class SixPointTwoTwo {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(calculateCelsius());
        System.out.println(calculateFahrenheit());
      //  calculateCelciusOrFahrenheit();
    }

    public static double calculateCelsius()
    {   double celsius;
        System.out.println("Enter fahrenheit");
        double fahrenheit = input.nextInt();
        celsius = 5.0 /9.0 * (fahrenheit - 32);
        return celsius;
    }
    public static double calculateFahrenheit()
    {
        double fahrenheit;
        System.out.println("Enter celsius");
        double celcius = input.nextInt();
        fahrenheit = 9.0 /5.0 * celcius + 32;
        return fahrenheit;
    }
//    public static void calculateCelciusOrFahrenheit()
//    {
//        calculateCelsius();
//        double fahrenheit = 0;
//        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
//        calculateFahrenheit();
//    }
}
