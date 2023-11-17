package controllers;

import mfc.ModelFactoryController;
import models.Product;

import javax.swing.*;
import java.util.NoSuchElementException;

public class ControllerTest {


    ModelFactoryController mfc;
    public void test(){
        mfc = ModelFactoryController.getInstance();
        mfc.getServiceProduct().showProducts();
        Product product = null;
        String nameProduct = JOptionPane.showInputDialog("Ingrese el nombre del producto");
        try {
            product = mfc.getServiceProduct()
                    .find(nameProduct)
                    .orElseThrow();
            mfc.getServiceTest().testProduct(product);
        } catch (NoSuchElementException e) {
            System.out.println("El producto no existe");
        }
    }
}
