package chapterSeven;

import java.security.SecureRandom;
import java.util.Random;

public class DiceRolling {
    public static void main(String[] args)
    {
        int[] die = {2,3,4,5,6,7,8,9,10,11,12};

        Random randomNumbers = new Random();
        int die_one = 1+randomNumbers.nextInt(6);
        int die_two = 1+randomNumbers.nextInt(6);

        int sum = die_one + die_two;


    }
}
