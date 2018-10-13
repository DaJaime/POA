package fr.parisnanterre.miage.poa.shapes.implem;

import fr.parisnanterre.miage.poa.shapes.api.Mesurable2D;
import fr.parisnanterre.miage.poa.shapes.api.Mesurable3D;
import fr.parisnanterre.miage.poa.shapes.api.Translatable3D;

public abstract class Shape3D implements Translatable3D, Mesurable3D, Mesurable2D{
    private Point3D refPoint;

    public Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    @Override
    public Point3D getRefPoint() {
        return refPoint;
    }

    @Override
    public void translate(double dx, double dy, double dz) {
        refPoint.setX(refPoint.getX() + dx);
        refPoint.setY(refPoint.getY() + dy);
        refPoint.setZ(refPoint.getZ() + dy);
    }
}
