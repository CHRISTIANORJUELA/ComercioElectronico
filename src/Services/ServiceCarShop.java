package Services;

import mfc.ModelFactoryController;
import models.Product;

import java.util.ArrayList;

public class ServiceCarShop {
    private final ArrayList<Product> productArrayList = new ArrayList<>();

    public void append(Product product){
        productArrayList.add(product);
    }

    public void cleanCarShop(){
        productArrayList.clear();
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }
}
