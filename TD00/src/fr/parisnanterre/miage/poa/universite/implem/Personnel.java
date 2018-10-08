package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.InterfacePersonnel;

public abstract class Personnel implements InterfacePersonnel {
    private String nom;
    private String prenom;
    private String numSecuSocial;

    public Personnel(String nom, String prenom, String numSecuSocial) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecuSocial = numSecuSocial;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumSecuSocial() {
        return numSecuSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", nom, prenom, numSecuSocial);
    }
}
