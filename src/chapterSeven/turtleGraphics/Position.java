package chapterSeven.turtleGraphics;

import java.util.Objects;

public class Position {
    private int rowPosition;
    private int columnPosition;
    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString() {
        return "Position{" +
                "rowPosition=" + rowPosition +
                ", columnPosition=" + columnPosition +
                '}';
    }

//    @Override
//    public boolean equals(Object object)
//    {
//        if (object==null) return false;
//        if (this.getClass()!=object.getClass()) return false;
//        Position b = (Position) object;
//        if (this.rowPosition != b.rowPosition || this.columnPosition != b.columnPosition)
//        {
//            return false;
//        }
//        return true;
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Position comparedPosition = (Position) object;
        return rowPosition == comparedPosition.rowPosition && columnPosition == comparedPosition.columnPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowPosition, columnPosition);
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
}
