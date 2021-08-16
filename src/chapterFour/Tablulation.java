package chapterFour;

public class Tablulation {
    public static void main(String[] args) {
       System.out.println("N\t 10*N\t 100*N\t 1000*N");
            for (int count = 1; count <= 5; count++) {
                System.out.println(count + "     " + count * 10 + "     " + count * 100 + "     " + count * 1000);
            }
        }
}
