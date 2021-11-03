package chapterSixteeen;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = input.nextLine();
        validateEmail(email);
    }

    private static void validateEmail(String email) {
        String regex = "[a-zA-Z0-9_.-]+@[a-zA-Z.]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher emailMatcher = pattern.matcher(email);
        if(emailMatcher.matches()) {
            System.out.println("Email address is valid");
        } else {
            System.out.println("Email address is not valid");
        }
    }
}
