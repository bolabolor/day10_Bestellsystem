import java.util.HashMap;
import java.util.Objects;

public class Main {

    public static void main (String[] args){

        Product product1 = new Product("134Z", "Pullover");
        System.out.println(product1);

        HashMap<String,Product> productList = new HashMap<>();
        productList.put("1" ,new Product("2398A", "Kleid"));
        productList.put("2" ,product1);

        System.out.println(productList);


    }
}
