package fr.parisnanterre.miage.poa.universite.implem;

public class Etudiant extends Personnel {
    private int numBourse;

    public Etudiant(String nom, String prenom, int numSecuSocial, int numBourse) {
        super(nom, prenom, numSecuSocial);
        this.numBourse = numBourse;
    }

    public int getNumBourse() {
        return numBourse;
    }
}
