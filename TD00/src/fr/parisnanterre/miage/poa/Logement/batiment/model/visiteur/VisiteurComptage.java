package fr.parisnanterre.miage.poa.Logement.batiment.model.visiteur;

import fr.parisnanterre.miage.poa.Logement.batiment.model.base.*;

public class VisiteurComptage implements Visiteur {
    private int cpt;

    public VisiteurComptage() {
        this.cpt = 0;
    }

    @Override
    public Object value() {
        return cpt;
    }

    @Override
    public void visit(Truc t) {

    }

    @Override
    public void visit(Bureau b) {
        cpt++;
        for (Truc t : b.trucs){
            t.accept(this);
        }

    }

    @Override
    public void visit(CollectionDeLivres c) {
        cpt++;
    }

    @Override
    public void visit(GardeRobe g) {
        cpt++;
        for (Vetement v : g.vetements){
            g.accept(this);
        }

    }

    @Override
    public void visit(Piece p) {
        for (Truc t : p.trucs){
            t.accept(this);
        }


    }

    @Override
    public void visit(Lamp l) {
        cpt++;

    }

    @Override
    public void visit(Lit l) {
        cpt++;

    }

    @Override
    public void visit(Univers u) {
        for (Piece p : u.pieces){
            p.accept(this);
        }

    }

    @Override
    public void visit(Vetement v) {
        cpt++;

    }
}
