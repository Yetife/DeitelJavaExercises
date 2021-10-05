package chapterSeven.turtleGraphics;
public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = Direction.EAST;
    private final Position currentPosition = new Position(0, 0);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        PenPosition position = pen.getPosition();
        pen.setPosition(PenPosition.DOWN);
    }

    public void penUp() {
        PenPosition position = pen.getPosition();
        pen.setPosition(PenPosition.UP);
    }

    public Direction getCurrrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == Direction.EAST) changeCurrentDirectionTo(Direction.SOUTH);
        else if (currentDirection == Direction.SOUTH) changeCurrentDirectionTo(Direction.WEST);
        else if (currentDirection == Direction.WEST) changeCurrentDirectionTo(Direction.NORTH);
        else if (currentDirection == Direction.NORTH) changeCurrentDirectionTo(Direction.EAST);
    }

    private void changeCurrentDirectionTo(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void turnLeft() {
        if (currentDirection == Direction.EAST) changeCurrentDirectionTo(Direction.NORTH);
        else if (currentDirection == Direction.NORTH) changeCurrentDirectionTo(Direction.WEST);
        else if (currentDirection == Direction.WEST) changeCurrentDirectionTo(Direction.SOUTH);
        else if (currentDirection == Direction.SOUTH) changeCurrentDirectionTo(Direction.EAST);
    }

    public Position getCurrrentPosition() {

        return currentPosition;
    }

    public void moveForward(int numberOfSteps) {
        if (currentDirection == Direction.EAST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps - 1);
        }
        if (currentDirection == Direction.SOUTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps - 1);
        }
        if (currentDirection == Direction.WEST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() - (numberOfSteps - 1));
        }
        if (currentDirection == Direction.NORTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() - (numberOfSteps - 1));
        }
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if (this.pen.getPosition() == PenPosition.DOWN) {
            int[][] floor = sketchPad.getFloor();
            int rowPosition = currentPosition.getRowPosition();
            int columnPosition = currentPosition.getColumnPosition();
            if (this.currentDirection == Direction.EAST) {
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition][columnPosition + i] = 1;
                }
            } else
                if (this.currentDirection == Direction.SOUTH) {
                    for (int i = 0; i < numberOfSteps; i++) {
                        floor[rowPosition+i][columnPosition] = 1;
                    }
                }else
                if (this.currentDirection == Direction.WEST) {
                    for (int i = 0; i < numberOfSteps; i++) {
                        floor[rowPosition][columnPosition-i] = 1;
                    }
                }else
                if (this.currentDirection == Direction.NORTH) {
                    for (int i = 0; i < numberOfSteps; i++) {
                        floor[rowPosition-i][columnPosition] = 1;
                    }
                }
        }
        moveForward(numberOfSteps);
    }
}
