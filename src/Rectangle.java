public class Rectangle {
    private double length;
    private double width;


    public Rectangle(double rectangleLength, double rectangleWidth) {
        this.length =rectangleLength;
        this.width = rectangleWidth;
    }


    public double getRectangleLength() {
        return length;
    }

    public double getRectangleWidth() {
        return width;
    }

    public double getRectangleArea() {
        return (width*length);
    }

}
