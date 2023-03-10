public class Order {

    private String orderId;
    private String products;

    // Constructors

    public Order(){

    }
    public Order(String orderId, String products) {
        this.orderId = orderId;
        this.products = products;
    }

    // Getter & Setter
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    // Methods

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", products='" + products + '\'' +
                '}';
    }


}
