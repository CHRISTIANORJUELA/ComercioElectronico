package controllers;

import mfc.ModelFactoryController;
import models.CarShop;
import models.Person;
import models.Product;
import models.Receipt;

import javax.swing.*;
import java.util.ArrayList;

public class ControllerReceipt {

    private final ModelFactoryController mfc = ModelFactoryController.getInstance();
    public void finishSell(){
        Person person = mfc.getControllerPerson().putPerson();
        ArrayList<Product> listProducts = mfc.getServiceCarShop().getProductArrayList();
        CarShop carShop = new CarShop(person,listProducts);
        Receipt receipt = new Receipt(person,carShop);
        mfc.getServiceReceipt().append(receipt);
        mfc.getServiceReceipt().showReceipt();
        mfc.getServiceCarShop().cleanCarShop();
    }


}
