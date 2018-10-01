package fr.parisnanterre.miage.poa.shapes.implem;

import fr.parisnanterre.miage.poa.shapes.api.Mesurable2D;
import fr.parisnanterre.miage.poa.shapes.api.Translatable2D;

public abstract class Shape2D implements Mesurable2D, Translatable2D {

    private Point2D refPoint;

    public Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }

    @Override
    public void translate(double dx, double dy){
        refPoint.setX(refPoint.getX() + dx);
        refPoint.setY(refPoint.getY() + dy);
    }

}
