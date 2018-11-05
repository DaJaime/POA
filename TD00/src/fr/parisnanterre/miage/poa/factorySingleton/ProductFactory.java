package fr.parisnanterre.miage.poa.factorySingleton;

public class ProductFactory {
    public static ProductFactory instance;

    private ProductFactory() {
    }

    public static synchronized ProductFactory getInstance(){
        if (instance == null){
            instance = new ProductFactory();
        }
        return instance;
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
