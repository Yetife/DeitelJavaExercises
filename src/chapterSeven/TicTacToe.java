package chapterSeven;

public class TicTacToe {
    public static void main(String[] args) {
        String[][]  patterns;
        patterns = new String[][]{{"X", "O", "X"}, {"O", "X", "O"}, {"X", "O", "X"}};

        for (int rowNumber = 0; rowNumber < patterns.length; rowNumber++) {
            for(int columnNumber = 0; columnNumber < patterns.length; columnNumber++) {
                System.out.print((patterns[rowNumber][columnNumber]) + " ");
            }
            System.out.println();
        }
    }

}
