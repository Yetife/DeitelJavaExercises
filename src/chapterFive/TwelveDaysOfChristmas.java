package chapterFive;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 12:
                System.out.println("On the twelve day of Christmas my true love sent to me");
                break;
            case 11:
                System.out.println("On the eleven day of Christmas my true love sent to me");
                break;
            case 10:
                System.out.println("On the tenth day of Christmas my true love sent to me");
                break;
            case 9:
                System.out.println("On the ninth day of Christmas my true love sent to me");
                break;
            case 8:
                System.out.println("On the eight day of Christmas my true love sent to me");
                break;
            case 7:
                System.out.println("On the seventh day of Christmas my true love sent to me");
                break;
            case 6:
                System.out.println("On the sixth day of Christmas my true love sent to me");
                break;
            case 5:
                System.out.println("On the fifth day of Christmas my true love sent to me");
                break;
            case 4:
                System.out.println("On the fourth day of Christmas my true love sent to me");
                break;
            case 3:
                System.out.println("On the third day of Christmas my true love sent to me");
                break;
            case 2:
                System.out.println("On the second day of Christmas my true love sent to me");
                break;
            case 1:
                System.out.println("On the first day of Christmas my true love sent to me");
                break;
            default:
                System.out.println();
        }
        switch (day) {
            case 12:
                System.out.println("twelve drummers drumming");
            case 11:
                System.out.println("eleven pipers piping");
            case 10:
                System.out.println("ten lords a-leaping");
            case 9:
                System.out.println("nine ladies dancing");
            case 8:
                System.out.println("eight maids a-milking");
            case 7:
                System.out.println("seven swans a-swimming");
            case 6:
                System.out.println("six geese a-laying");
            case 5:
                System.out.println("five golden rings");
            case 4:
                System.out.println("four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves");
            case 1:
                System.out.println("A partridge in a pear tree.");
                break;
            default:
                System.out.println();
        }
    }
}
