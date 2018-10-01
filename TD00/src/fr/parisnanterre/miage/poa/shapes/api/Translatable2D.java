package fr.parisnanterre.miage.poa.shapes.api;

import fr.parisnanterre.miage.poa.shapes.implem.Point2D;

public interface Translatable2D {
    Point2D getRefPoint();
    void translate(double dx, double dy);
}
