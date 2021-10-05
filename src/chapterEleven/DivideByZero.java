package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        int firstNumber = input("Enter first number");
        int secondNumber = input("Enter second number");
      //   callThrowThrows();

        try {
            System.out.printf("The quotient is %d", (firstNumber / secondNumber));
        } catch (ArithmeticException jerry) {
            System.out.println("An error occured");
            System.out.println(jerry.getMessage());
        }

    }

//    private static void callThrowThrows() throws Exception, Error {
//
//            }
//    }

    private static int input (String prompt)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException ex){
                System.err.println("Re-enter number");
                return  input(prompt);
            }
        }
        private static  int throwsThrows() throws Exception
        {
            System.out.println("Throw throw was called");
            throw  new Exception("You forced my hands");
        }
}
