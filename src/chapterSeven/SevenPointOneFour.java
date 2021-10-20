package chapterSeven;

public class SevenPointOneFour {
    public static void main(String[] args) {
        int numberOne = 12;
        int numberTwo = 17;
        int numberThree = 18;
        int numberFour= 22;
        int numberFive = 20;

        System.out.println("Product of interger is: " + calculateProductOfIntegers(numberFive, numberOne));
        System.out.println("Product of interger is: " + calculateProductOfIntegers(numberFour, numberTwo));
        System.out.println("Product of interger is: " + calculateProductOfIntegers(numberFive, numberOne, numberThree));
        System.out.println("Product of interger is: " + calculateProductOfIntegers(numberFive, numberOne, numberFour, numberTwo));
        System.out.println("Product of interger is: " + calculateProductOfIntegers(numberFive, numberOne, numberFour, numberTwo, numberThree));
    }

    public static int calculateProductOfIntegers(int... intergers)
    {
        int product = 1;
        for (int number : intergers)
        {
            product *= number;
        }
        return product;
    }
}
