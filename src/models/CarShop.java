package models;

import java.util.ArrayList;

public class CarShop {
    private Person person;
    private ArrayList<Product> listProduct;

    public CarShop(Person person,ArrayList<Product> listProduct) {
        this.person = person;
        this.listProduct = listProduct;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }
}
