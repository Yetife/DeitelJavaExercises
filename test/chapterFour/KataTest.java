package chapterFour;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void calculateFactorial() {
        Kata kata = new Kata();
        int result = kata.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void squareFunctionTest() {
        Kata kata = new Kata();
        int result = kata.calculateSquare(5);
        assertEquals(25, result);
    }

    @Test
    public void calculateTheAmountOf0neToFourBooksTest() {
        Kata kata = new Kata();
        int result = kata.calculateBookAmount(4);
        assertEquals(6000, result);
        assertEquals(3000, kata.calculateBookAmount(2));
        assertEquals(1500, kata.calculateBookAmount(1));
    }

    @Test
    public void calculateTheAmountOfFiveToNineBooksTest() {
        Kata kata = new Kata();
        int result = kata.calculateBookAmount(5);
        assertEquals(7000, result);
        assertEquals(9800, kata.calculateBookAmount(7));
        assertEquals(11200, kata.calculateBookAmount(8));
    }

    @Test
    public void calculateTheAmountOfTenToTwentyNineBooksTest() {
        Kata kata = new Kata();
        int result = kata.calculateBookAmount(17);
        assertEquals(20400, result);
        assertEquals(25200, kata.calculateBookAmount(21));
    }

    @Test
    public void calculateTheAmountOfThirtyToFortyNineBooksTest() {
        Kata kata = new Kata();
        int result = kata.calculateBookAmount(30);
        assertEquals(33000, result);
        assertEquals(41800, kata.calculateBookAmount(38));
    }
    @Test
    public void calculateTheAmountOfFiftyToNinetyNineBooksTest() {
        Kata kata = new Kata();
        int result = kata.calculateBookAmount(50);
        assertEquals(50000, result);
        assertEquals(64000, kata.calculateBookAmount(64));
    }
    @Test
    public void calculateTheAmountOfHundredToOneHundredAndNineBooksTest() {
        Kata kata = new Kata();
        int result = kata.calculateBookAmount(100);
        assertEquals(90000, result);
        assertEquals(135000, kata.calculateBookAmount(150));
    }
    @Test
    public void calculateTheAmountOTwofHundredAndAboveBooksTest() {
        Kata kata = new Kata();
        int result = kata.calculateBookAmount(200);
        assertEquals(160000, result);
        assertEquals(200000, kata.calculateBookAmount(250));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kata kata = new Kata();
        String prompt = """        
                1 -> Factorial
                2 -> Square
                3 -> Book amount
                Press any key          
                """;
        System.out.println(prompt);
        int userResponse = scanner.nextInt();
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        if (userResponse == 1) System.out.println(kata.calculateFactorial(userInput));
        else if (userResponse == 2) System.out.println(kata.calculateSquare(userInput));
        else if (userResponse == 3) System.out.println(kata.calculateBookAmount(userInput));
    }

    @Test
    public void twelveDayOfChristmasTest(){
        Kata kata = new Kata();
        String result = kata.twelveDaysOfChristmas(1);
        assertEquals( """
                                 On the first day of christmas, my true love sent to me
                                 A partridge in a pear tree.""", result);
        //assertEquals("On the first day of christmas my true love sent to me A partridge in a pear tree", result);
    }

}