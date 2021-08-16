package chapterFour;

import java.util.Random;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String... args) {
       // System.out.println("\n".repeat(50));
        String prompt = """        
                1 -> Create Account
                2 -> Close Account
                3 -> Approve loan
                4 -> Run Away
                Press any key          
                """;
        Scanner scanner = new Scanner(System.in);

        System.out.println(prompt);
        int userResponse = scanner.nextInt();
        switch (userResponse) {
            case 3:
                System.out.println("5million approved");
                break;
            case 1:
                System.out.println("Account created");
                break;
            case 2:
                System.out.println("Account closed");
                break;
            case 4:
                System.out.println("Run away");
                break;
            default:
                System.out.println("Very good");
                main();
        }
    }
}

