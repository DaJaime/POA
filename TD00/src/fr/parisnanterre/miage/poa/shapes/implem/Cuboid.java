package fr.parisnanterre.miage.poa.shapes.implem;

import fr.parisnanterre.miage.poa.shapes.api.Mesurable2D;

public class Cuboid extends Shape3D implements Mesurable2D{
    private double lenght;
    private double width;
    private double height;

    public Cuboid(Point3D refPoint, double lenght, double width, double height) {
        super(refPoint);
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * lenght + 2 * width;
    }

    @Override
    public double surface() {
        return lenght * width;
    }

    @Override
    public double volume() {
        return lenght * width * height;
    }
}
