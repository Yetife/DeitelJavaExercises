package groupWork;

public class TicTacToe {
    Board board = new Board();
    private static BoardValue boardValue = BoardValue.EMPTY;
    private String[][] boardArray = new String[3][3];


    public static BoardValue getBoardValue() {
        return boardValue;
    }

    public Board getBoard() {
        return board;
    }
}
