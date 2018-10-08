package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.InterfacePersonnel;

public abstract class Personnel implements InterfacePersonnel {
    private String nom;
    private String prenom;
    private int numSecuSocial;

    public Personnel(String nom, String prenom, int numSecuSocial) {
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

    public int getNumSecuSocial() {
        return numSecuSocial;
    }
}
