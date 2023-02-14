package bookstore01;

public abstract class Products {
    private int id;
    private String productName;
    private int price;
    private int stock;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Products(int id,String productName, int price, int stock) {

        this.id = id;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
