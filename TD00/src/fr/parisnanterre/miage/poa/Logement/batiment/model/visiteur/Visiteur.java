package fr.parisnanterre.miage.poa.Logement.batiment.model.visiteur;

import fr.parisnanterre.miage.poa.Logement.batiment.model.base.*;

public interface Visiteur {
    Object value();
    void visit(Truc t);
    void visit(Bureau b);
    void visit(CollectionDeLivres c);
    void visit(GardeRobe g);
    void visit(Piece p);
    void visit(Lamp l);
    void visit(Lit l);
    void visit(Univers u);
    void visit(Vetement v);
}
