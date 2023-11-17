package controllers;

import mfc.ModelFactoryController;
import models.Order;
import models.Receipt;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class ControllerOrder {
    ArrayList<Order> orders = new ArrayList<>();

    ModelFactoryController mfc;
    private final Random random = new Random();
    public void add(Receipt receipt){
         mfc = ModelFactoryController.getInstance();
         mfc.getServiceOrder().append(receipt);
    }

    public void dispatcher(){
       if (mfc.getServiceOrder().getOrders().isEmpty()){
            System.out.println("Ordenes vacias");
            return;
        }
      mfc = ModelFactoryController.getInstance();
      mfc.getServiceOrder().dispatcherOrder();
    }

    public void consult(){
        if (mfc.getServiceOrder().getOrders().isEmpty()){
            System.out.println("Ordenes vacias");
            return;
        }
        mfc = ModelFactoryController.getInstance();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un id que quieras buscar"));
        try {
            Order order = mfc.getServiceOrder().
                    find(id)
                    .orElseThrow();
            System.out.println("id order"+order.getId());
            System.out.println("Para la persona"+order.getReceipt().getPerson().getName());
            System.out.println("Con destino a : "+order.getDestino());
            System.out.println("Con los productos");
            order.getReceipt()
                    .getCarShop()
                    .getListProduct()
                    .forEach(System.out::println);
            System.out.println("El precio de la compra es : "+order.getReceipt().getTotalAmoung());
        }catch (Exception e){
            System.out.println("No hay ninguna orden con ese id");
        }
    }

    public void showOrders(){
        if (mfc.getServiceOrder().getOrders().isEmpty()){
            System.out.println("Ordenes vacias");
            return;
        }
        mfc = ModelFactoryController.getInstance();
        mfc.getServiceOrder().showData();
    }
}
