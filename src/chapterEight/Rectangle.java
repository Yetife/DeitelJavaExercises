package chapterEight;

public class Rectangle {
    private double length = 1;
    private double width = 1;

    public void setLength(double length) {
        if (length > 0.0 & length < 20.0){
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0.0 & width < 20.0){
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public double calculatePerimeter() {
        return 2 * (length+ width);
    }

    public double calculateArea() {
        return length * width;
    }
}
