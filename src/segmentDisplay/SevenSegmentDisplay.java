package segmentDisplay;

public class SevenSegmentDisplay {
    private static int[][] screen = new int[5][4];
    private static int[] userNumber;


    public int[] userNumber(String input) {
        validateTheLengthOfInput(input);
        input = checkForTrailingZeros(input);
        userNumber = new int[8];
        for (int i = 0; i < userNumber.length; i++) {
            userNumber[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            validateForInvalidBinaryDigit(i);
        }
        return userNumber;
    }

    private void validateForInvalidBinaryDigit(int i) {
        if (userNumber[i] != 0 && userNumber[i] != 1)
            throw new IllegalArgumentException("Input at " + (i + 1) + " is invalid");
    }

    private String checkForTrailingZeros(String input) {
        if (input.length() < 8) {
            int userInput = Integer.parseInt(input);
            input = String.format("%08d", userInput);
        }
        return input;
    }

    private void validateTheLengthOfInput(String input) {
        if (input.length() > 8) {
            throw new IllegalArgumentException("User input is too large");
        }
    }

    public void segmentA() {
        for (int i = 0; i < 4; i++) {
            screen[0][i] = 1;
    }
    }

    public void segmentB() {
        for (int i = 0; i < 3; i++) {
            screen[i][3] = 1;
        }
    }
    public void segmentC() {
        for (int i = 2; i < 5; i++) {
            screen[i][3] = 1;
        }
    }
    public void segmentD() {
        for (int i = 0; i < 4; i++) {
            screen[4][i] = 1;
        }
    }
    public void segmentE() {
        for (int i = 2; i < 5; i++) {
            screen[i][0] = 1;
        }
    }

    public void segmentF() {
        for (int i = 0; i < 3; i++) {
            screen[i][0] = 1;
        }
    }

    public void segmentG() {
        for (int i = 0; i < 4; i++) {
            screen[2][i] = 1;
        }
    }

    public void setScreen(String input) {
        int[] userNumber = userNumber(input);
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                if (SevenSegmentDisplay.userNumber[7] == 1) {
                    if (SevenSegmentDisplay.userNumber[0] == 1) segmentA();
                    if (SevenSegmentDisplay.userNumber[1] == 1) segmentB();
                    if (SevenSegmentDisplay.userNumber[2] == 1) segmentC();
                    if (SevenSegmentDisplay.userNumber[3] == 1) segmentD();
                    if (SevenSegmentDisplay.userNumber[4] == 1) segmentE();
                    if (SevenSegmentDisplay.userNumber[5] == 1) segmentF();
                    if (SevenSegmentDisplay.userNumber[6] == 1) segmentG();
                } else {
                    clearScreen();
                }
            }
        }
    }

        public void displaySegments () {
            for (int row = 0; row < screen.length; row++) {
                for (int column = 0; column < screen[row].length; column++) {
                    if (screen[row][column] == 1) System.out.print("# ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }

        public void clearScreen () {
            screen = new int[5][4];
        }

        public static int[][] getScreen () {
            return screen;
        }
}
