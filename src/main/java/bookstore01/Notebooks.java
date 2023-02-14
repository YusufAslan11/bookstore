package bookstore01;

public class Notebooks extends Products {
    private String brand;
    private String pageOfNumber;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPageOfNumber() {
        return pageOfNumber;
    }

    public void setPageOfNumber(String pageOfNumber) {
        this.pageOfNumber = pageOfNumber;
    }

    public Notebooks(int id,String productName,String brand, String pageOfNumber, int price, int stock) {
        super(id,productName, price, stock);
        this.brand = brand;
        this.pageOfNumber = pageOfNumber;
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public void setProductName(String productName) {
        super.setProductName(productName);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public int getStock() {
        return super.getStock();
    }

    @Override
    public void setStock(int stock) {
        super.setStock(stock);
    }
}
