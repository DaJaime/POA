package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IEnseignant;

import java.util.Date;

public abstract class Enseignant extends Personnel implements IEnseignant {
    Date dateRecretement;
    double salaire;

    public Enseignant(String nom, String prenom, String numSecuSocial, Date dateRecretement, double salaire) {
        super(nom, prenom, numSecuSocial);
        this.dateRecretement = dateRecretement;
        this.salaire = salaire;
    }

    @Override
    public Date dateRecretement() {
        return null;
    }

    @Override
    public double salaire() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Enseignant %s recrute(e) le %s, salaire : %.2f", super.toString(), dateRecretement, salaire);
    }
}
