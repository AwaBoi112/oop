package oop.labor02.rectangle;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double x, double y) {
        length = x;
        width = y;

    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double Area(){
        return length * width;
    }
    public double Perimeter(){
        return 2*length+2*width;
    }

}
