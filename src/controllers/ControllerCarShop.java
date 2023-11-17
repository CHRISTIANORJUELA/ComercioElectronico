package controllers;

import mfc.ModelFactoryController;
import models.Product;
import javax.swing.*;
import java.util.NoSuchElementException;

public class ControllerCarShop {

    private ModelFactoryController mfc;

    public void buyProducts() {
        mfc = ModelFactoryController.getInstance();
        mfc.getServiceProduct().showProducts();
        String nameProduct;
        Product product;
        while (true) {
            nameProduct = JOptionPane.showInputDialog("Ingrese un nombre de un producto o escriba \n e para salir");
            if (nameProduct.equalsIgnoreCase("e")) {
                break;
            }
            try {
                product = mfc.getServiceProduct()
                        .find(nameProduct)
                        .orElseThrow();
                mfc.getServiceCarShop().append(product);
                System.out.println("Agregado al carrito");
            } catch (NoSuchElementException e) {
                System.out.println("El producto no existe");
            }
        }
        if (!mfc.getServiceCarShop().getProductArrayList().isEmpty()){
            mfc.getControllerReceipt().finishSell();
        }
    }


}
