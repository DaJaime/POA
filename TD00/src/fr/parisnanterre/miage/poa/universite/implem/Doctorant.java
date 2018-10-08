package fr.parisnanterre.miage.poa.universite.implem;

public class Doctorant extends Etudiant {
    public Doctorant(String nom, String prenom, String numSecuSocial, EchelonBourse echelon) {
        super(nom, prenom, numSecuSocial, echelon.DOCTORANT);
    }

    @Override
    public String toString() {
        return String.format("Doctorant %s", super.toString());
    }
}
