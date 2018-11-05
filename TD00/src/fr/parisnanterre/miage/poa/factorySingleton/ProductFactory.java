package fr.parisnanterre.miage.poa.factorySingleton;

public class ProductFactory {
    public ProductFactory() {
    }
    public Product createProduct(String langue){
        switch (langue){
            case "Fr":
                return new ProductFr();
            case "En":
                return new ProductEn();
            case "Es":
                return new ProductEs();
            default:
                return null;
        }
    }
}
