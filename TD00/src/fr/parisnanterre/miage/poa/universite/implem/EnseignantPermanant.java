package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IEnseignantPermanant;

import java.util.Date;

public abstract class EnseignantPermanant extends Enseignant implements IEnseignantPermanant {
    private String domaineRecherche;

    public EnseignantPermanant(String nom, String prenom, String numSecuSocial, Date dateRecretement, double salaire, String domaineRecherche) {
        super(nom, prenom, numSecuSocial, dateRecretement, salaire);
        this.domaineRecherche = domaineRecherche;
    }

    @Override
    public String domaineRecherche() {
        return domaineRecherche;
    }

    @Override
    public String toString() {
        return String.format("%s, domaine : %s", super.toString(), domaineRecherche);
    }
}
