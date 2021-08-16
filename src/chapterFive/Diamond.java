package chapterFive;

public class Diamond {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 9; counter+=2){
            for(int count1 = 9; count1 > counter ; count1--){
                System.out.print(" ");
            }
            for(int count2 = 1; count2 <= counter; count2++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for(int counter = 9; counter >= 1; counter-=2){
            for(int count = 9; count > counter ; count--){
                System.out.print(" ");
            }
            for(int count2 = 1; count2 <= counter; count2++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
