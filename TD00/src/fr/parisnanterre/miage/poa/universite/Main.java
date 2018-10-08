package fr.parisnanterre.miage.poa.universite;

import fr.parisnanterre.miage.poa.universite.api.IBoursier;
import fr.parisnanterre.miage.poa.universite.api.IEnseignant;
import fr.parisnanterre.miage.poa.universite.api.IEnseignantPermanant;
import fr.parisnanterre.miage.poa.universite.implem.Doctorant;
import fr.parisnanterre.miage.poa.universite.implem.Personnel;
import fr.parisnanterre.miage.poa.universite.implem.Professeur;

import java.util.Date;

import static fr.parisnanterre.miage.poa.universite.implem.EchelonBourse.DOCTORANT;

public class Main {
    public static void main(String[] args){
        Personnel bob = new Doctorant("Jaime", "Damien", "1234567890", DOCTORANT);
        System.out.println(bob);
        System.out.println(((IBoursier)bob).montantBourse());

        IEnseignantPermanant alice = new Professeur("Merveilles", "Alice", "12345", new Date(), 3000, "Info");
        System.out.println(alice);

    }
}
