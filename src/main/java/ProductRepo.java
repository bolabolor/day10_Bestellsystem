import java.util.HashMap;

public class ProductRepo {


    private HashMap products;


    // Constructor
    public ProductRepo(HashMap products) {
        this.products = products;
    }

    public ProductRepo(){

    }

    // Getter
    public HashMap getProducts() {
        return products;
    }

    //Setter
    public void setProducts(HashMap products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
    public ProductRepo getProduct(HashMap products) {
        for (int i = 0; i < products.get(); i++) {
            if (products.equals(products.[i].getProducts())) {
                return products[i];
            }
        }

}
