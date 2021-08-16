package chapterFive;

public class FivePointOneThree {
    public static void main(String[] args) {
        int factorial = 1;
        System.out.println("Number\t Factorial");
        for (int count = 1; count <= 20; count++){
            factorial = factorial * count;
            System.out.println(count + "\t\t\t" + factorial);
        }
    }
}
