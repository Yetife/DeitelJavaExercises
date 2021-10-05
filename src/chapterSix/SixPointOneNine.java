package chapterSix;

import java.util.Scanner;

public class SixPointOneNine {
  public static   Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
      printShape();
    }

    public static void printShape()
    {   System.out.println("Enter a nmber");
        int number = input.nextInt();
        System.out.println("Enter a sign");
        char fill = input.next().charAt(0);
       for(int row = 1; row <= number; row++){
           for (int column = 1; column <= number; column++){
               System.out.print(fill);
           }
           System.out.println();
       }
    }
}
