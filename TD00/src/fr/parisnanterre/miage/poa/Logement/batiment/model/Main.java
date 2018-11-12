package fr.parisnanterre.miage.poa.Logement.batiment.model;

import fr.parisnanterre.miage.poa.Logement.batiment.model.base.*;
import fr.parisnanterre.miage.poa.Logement.batiment.model.visiteur.Visiteur;
import fr.parisnanterre.miage.poa.Logement.batiment.model.visiteur.VisiteurComptage;
import fr.parisnanterre.miage.poa.Logement.batiment.model.visiteur.VisiteurEnglish;
import fr.parisnanterre.miage.poa.Logement.batiment.model.visiteur.VisiteurFrench;

public class Main {
    public static void main(String[] args){
        Truc l = new Lit();
        Piece p = new Piece("chambre");
        p.ajouter(l);
        Univers u = new Univers();
        u.ajouter(p);
        Bureau b = new Bureau();
        p.ajouter(b);
        Truc x = new Lamp();
        b.ajouter(x);

        Visiteur v = new VisiteurFrench();
        v.visit(u);

        Visiteur ve = new VisiteurEnglish();
        ve.visit(u);

        Visiteur compt = new VisiteurComptage();
        u.accept(compt);
        System.out.println(compt.value());
    }
}
