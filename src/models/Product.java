package models;

public class Product {
    private String name;

    private String funtion;
    private int price;

    private Product(Product product){
        this.name = product.getName();
        this.funtion = product.getFuntion();
    }
    public Product(String name, int price,String funtion) {
        this.name = name;
        this.price = price;
        this.funtion = funtion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFuntion() {
        return funtion;
    }

    public Product cloned(){
        return new Product(this);
    }
}
