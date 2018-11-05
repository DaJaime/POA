package fr.parisnanterre.miage.poa.factorySingleton.produits;

class ProductEs implements Product {
    ProductEs() {
    }

    @Override
    public void afficherProduit() {
        System.out.println("Soy un producto !");
    }
}
