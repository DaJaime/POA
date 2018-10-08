package fr.parisnanterre.miage.poa.universite.implem;

import java.util.Date;

public class Professeur extends EnseignantPermanant{
    public Professeur(String nom, String prenom, String numSecuSocial, Date dateRecretement, double salaire, String domaineRecherche) {
        super(nom, prenom, numSecuSocial, dateRecretement, salaire, domaineRecherche);
    }

    @Override
    public String toString() {
        return String.format("Professeur %s", super.toString());
    }
}
