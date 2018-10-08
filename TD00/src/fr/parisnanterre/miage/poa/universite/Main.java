package fr.parisnanterre.miage.poa.universite;

import fr.parisnanterre.miage.poa.universite.api.IBoursier;
import fr.parisnanterre.miage.poa.universite.implem.Doctorant;
import fr.parisnanterre.miage.poa.universite.implem.Personnel;

import static fr.parisnanterre.miage.poa.universite.implem.EchelonBourse.DOCTORANT;

public class Main {
    public static void main(String[] args){
        Personnel bob = new Doctorant("Jaime", "Damien", "1234567890", DOCTORANT);
        System.out.println(bob);
        System.out.println(((IBoursier)bob).montantBourse());

    }
}
