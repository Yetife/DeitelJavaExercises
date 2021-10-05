package chapterSeven;

public class SevenSegmentDisplay {
    public static int[][] segments = new int[5][4];
    public static void main(String[] args) {
        segments = new int[][]{{1, 1, 1, 1},{1,0,0,1},{1,1,1,1},{1,0,0,1}, {1,1,1,1}};
        displaySegment();
    }

    public static void displaySegment()
    {
        for (int row = 0; row < segments.length; row++) {
            for (int column = 0; column < segments[row].length; column++) {
                if (segments[row][column] == 1){
                    System.out.print("# ");
                }else if (segments[row][column] == 0){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
