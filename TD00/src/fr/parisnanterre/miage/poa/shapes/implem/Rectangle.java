package fr.parisnanterre.miage.poa.shapes.implem;

public class Rectangle extends Shape2D {

    private double lenght;
    private double width;

    public Rectangle(Point2D refPoint, double length, double width) {
        super(refPoint);
        this.lenght = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2*lenght + 2*width;
    }

    @Override
    public double surface() {
        return lenght * width;
    }
}
