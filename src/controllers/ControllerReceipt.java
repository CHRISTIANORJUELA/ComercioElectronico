package controllers;

import mfc.ModelFactoryController;
import models.CarShop;
import models.Person;
import models.Product;
import models.Receipt;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class ControllerReceipt {

    private ModelFactoryController mfc;
    private final Random random = new Random();
    public void finishSell(){
        mfc = ModelFactoryController.getInstance();
        JOptionPane.showMessageDialog(null,"Iniciando transferencia de pago");
        String num = String.valueOf(random.nextInt(999)+1);
        String numAfter = JOptionPane.showInputDialog("Que numero ve en la pantalla "+num).strip();
        if (!num.equalsIgnoreCase(numAfter)){
            System.out.println("Fallo en la autenticación");
            return;
        }
        System.out.println("Autenticación completada");
        Person person = mfc.getControllerPerson().putPerson();
        ArrayList<Product> listProducts = (ArrayList<Product>) mfc.getServiceCarShop().getProductArrayList().clone();
        CarShop carShop = new CarShop(person,listProducts);
        Receipt receipt = new Receipt(person,carShop);
        Receipt receiptOrder = mfc.getServiceReceipt().append(receipt);
        mfc.getServiceReceipt().showReceipt();
        mfc.getServiceCarShop().cleanCarShop();
        mfc.getControllerOrder().add(receiptOrder);
    }

    public void showAmoung(){
        mfc = ModelFactoryController.getInstance();
        mfc.getServiceReceipt().showAmount();
    }

}
