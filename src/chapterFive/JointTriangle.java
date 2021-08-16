package chapterFive;

public class JointTriangle {
   public static void main(String[] args) {
       for (int counter = 1; counter <= 10; counter++) {
           for (int count = 1; count <= counter; count++) {
               System.out.print("*");
           }
           for (int counter1 = 10; counter1 >= counter; counter1--) {
               System.out.print(" ");
           }
           for (int counter1 = 1; counter1 <= 3; counter1++) {
               System.out.print("  ");
           }
           for (int count = 10; count >= counter; count--) {
              System.out.print("*");
           }
           for (int counter1 = 1; counter1 <= counter; counter1++) {
               System.out.print(" ");
           }
           for (int counter1 = 1; counter1 <= 3; counter1++) {
               System.out.print("  ");
           }
           for (int count = 1; count <= counter; count++) {
               System.out.print(" ");
           }
           for (int counter1 = 10; counter1 >= counter; counter1--) {
                    System.out.print("*");
           }
           for (int count = 10; count >= counter; count--) {
               System.out.print(" ");
           }
           for (int counter1 = 1; counter1 <= 3; counter1++) {
               System.out.print("  ");
           }
           for (int counter1 = 1; counter1 <= counter; counter1++) {
               System.out.print("*");
           }
           System.out.print("");
           System.out.println();
          // System.out.println(counter);
       }
        }
  }
