package fr.parisnanterre.miage.poa.universite.implem;

import fr.parisnanterre.miage.poa.universite.api.IBoursier;

public class Etudiant extends Personnel implements IBoursier {
    private EchelonBourse echelon;

    public Etudiant(String nom, String prenom, String numSecuSocial, EchelonBourse echelon) {
        super(nom, prenom, numSecuSocial);
        this.echelon = echelon;
    }

    @Override
    public double montantBourse() {
        return echelon.montantBourse();
    }

    @Override
    public String toString() {
        return String.format("Etudiant %s", super.toString());
    }
}
