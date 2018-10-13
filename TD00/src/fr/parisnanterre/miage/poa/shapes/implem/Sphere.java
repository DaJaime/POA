package fr.parisnanterre.miage.poa.shapes.implem;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }

    @Override
    public double volume() {
        double puissance = Math.pow(radius, 3);
        return (4*Math.PI/3) * puissance;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double surface() {
        return 4*Math.PI*Math.pow(radius, 2);
    }
}
