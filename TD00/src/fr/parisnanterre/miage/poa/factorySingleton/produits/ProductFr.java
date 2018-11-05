package fr.parisnanterre.miage.poa.factorySingleton.produits;

class ProductFr implements Product {
    ProductFr() {
    }

    @Override
    public void afficherProduit() {
        System.out.println("Je suis un produit !");
    }
}
