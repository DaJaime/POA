package fr.parisnanterre.miage.poa.factorySingleton.produits;

class ProductEn implements Product {
    ProductEn() {
    }

    @Override
    public void afficherProduit() {
        System.out.println("I'm a product !");
    }
}
