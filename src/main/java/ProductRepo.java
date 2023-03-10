import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ProductRepo {


    private ArrayList<Product> products = new ArrayList<Product>();
    public Product addProduct(Product product){
        products.add(product);
        return product;
    }



    // Constructor
    public ProductRepo(ArrayList<Product> products) {
        this.products = products;
    }

    public ProductRepo(){

    }

    // Getter und Setter

    public ArrayList<Product> getAllProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
    public Product getProduct(String id) {
        for (Product product : products) { //Für jedes Produkt in meinen Produkten möchte ich diesdas machen
            if (product.getId().equals(id)){// Vergleicht id von product mit Ids aus meiner arraylist
                System.out.println(product);
                return product;
            }
        }
        throw new NoSuchElementException("Product with ID " + id + " not found." );
    }
    }
