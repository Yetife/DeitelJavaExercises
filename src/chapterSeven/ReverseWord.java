package chapterSeven;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any name");
        String word = input.next();

        for(int i = 1; i <= word.length(); i++){
            System.out.print(word.charAt(word.length()-i));
        }
    }
}
