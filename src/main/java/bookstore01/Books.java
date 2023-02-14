package bookstore01;

public class Books extends Products {
    private String authorName;
    private String publisher;

    public Books(int id,String productName, String authorName, String publisher,int price, int stock) {
        super(id,productName, price, stock);
        this.authorName = authorName;
        this.publisher = publisher;
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


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
