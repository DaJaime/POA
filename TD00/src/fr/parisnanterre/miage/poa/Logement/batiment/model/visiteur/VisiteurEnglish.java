package fr.parisnanterre.miage.poa.Logement.batiment.model.visiteur;

import fr.parisnanterre.miage.poa.Logement.batiment.model.base.*;

public class VisiteurEnglish implements Visiteur {
    @Override
    public Object value() {
        return null;
    }

    @Override
    public void visit(Truc t) {

    }

    @Override
    public void visit(Bureau b) {
        System.out.println("I am a desk");
        for (Truc t : b.trucs){
            t.accept(this);
        }

    }

    @Override
    public void visit(CollectionDeLivres c) {
        System.out.println("Je suis une collection de" + c.nbLivres + "livres");
    }

    @Override
    public void visit(GardeRobe g) {
        System.out.println("Je suis une garde robe");
        for (Vetement v : g.vetements){
            g.accept(this);
        }

    }

    @Override
    public void visit(Piece p) {
        System.out.println("I am a Room");
        for (Truc t : p.trucs){
            t.accept(this);
        }


    }

    @Override
    public void visit(Lamp l) {
        System.out.println("I am a light");

    }

    @Override
    public void visit(Lit l) {
        System.out.println("I am a Bed");

    }

    @Override
    public void visit(Univers u) {
        System.out.println("I am a Universe");
        for (Piece p : u.pieces){
            p.accept(this);
        }

    }

    @Override
    public void visit(Vetement v) {
        System.out.println("Je suis un vetement");

    }
}
