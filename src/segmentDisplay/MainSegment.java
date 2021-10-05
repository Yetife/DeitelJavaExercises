package segmentDisplay;

import java.util.Arrays;
import java.util.Scanner;

public class MainSegment {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a binary number");
        String userInput = input.next();
       SevenSegmentDisplay display = new SevenSegmentDisplay();
        System.out.println(Arrays.toString(display.userNumber(userInput)));
       display.clearScreen();
       display.setScreen(userInput);

       display.displaySegments();
    }

}
