package fr.parisnanterre.miage.poa.factorySingleton.client;

import fr.parisnanterre.miage.poa.factorySingleton.produits.Product;
import fr.parisnanterre.miage.poa.factorySingleton.produits.ProductFactory;

public class Client {
    public static void main(String[] args){
        ProductFactory factory = ProductFactory.getInstance();
        Product produit1 = factory.createProduct("Fr");
        produit1.afficherProduit();

        Product produit2 = factory.createProduct("En");
        produit2.afficherProduit();

        Product produit3 = factory.createProduct("Es");
        produit3.afficherProduit();
    }
}
