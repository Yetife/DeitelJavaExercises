package chapterFive;
        public class Triangle {
    public static void main(String[] args) {

        // int number = 10;

        for (int counter = 1; counter <= 10; counter++) {
            for (int counter1 = 1; counter1 <= counter; counter1++) {
                System.out.print("*");
            }
            System.out.println();
          //  System.out.println(counter);
        }

        System.out.println("\t");
        for (int counter = 1; counter <= 10; counter++) {
            for (int counter1 = 10; counter1 >= counter; counter1--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\t");
        for (int counter = 1; counter <= 10; counter++) {
            for (int count = 1; count <= counter; count++) {
                System.out.print(" ");
            }
            for (int counter1 = 10; counter1 >= counter; counter1--) {
                System.out.print("*");
            }
            System.out.println();
           // System.out.println(counter);
        }

        System.out.println("\t");
        for (int counter = 1; counter <= 10; counter++) {
            for (int count = 10; count >= counter; count--) {
                System.out.print("");
            }
            for (int counter1 = 1; counter1 <= counter; counter1++) {
                System.out.print("*");
            }
            System.out.println();
           // System.out.println(counter);
        }


    }
}
