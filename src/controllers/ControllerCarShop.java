package controllers;

import mfc.ModelFactoryController;
import models.Product;
import javax.swing.*;

public class ControllerCarShop {

    ModelFactoryController mfc = ModelFactoryController.getInstance();
    public void buyProducts(){
        mfc.getServiceProduct().showProducts();
        String nameProduct;
        Product product;
        while (true){
            nameProduct = JOptionPane.showInputDialog("Ingrese un nombre de un producto o escriba \n e para salir");
            if (nameProduct.equalsIgnoreCase("e")){
                break;
            }
            product = mfc.getServiceProduct().find(nameProduct).get();
            if (product!=null){
                mfc.getServiceCarShop().append(product);
            }
        }
        mfc.getControllerReceipt().finishSell();
    }
}
