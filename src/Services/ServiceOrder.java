package Services;

import models.Order;
import models.Product;
import models.Receipt;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class ServiceOrder {

    private final ArrayList<Order> orders = new ArrayList<>();

    private final Random random = new Random();
    public void append(Receipt receipt){
        String destino = JOptionPane.showInputDialog("Ingresa en que ciudad vives para subir la orden");
        orders.add(new Order(destino,receipt,random.nextInt(10)+1));
    }

    public void dispatcherOrder(){
        orders.remove(0);
        System.out.println("Envio despachado");
    }

    public Optional<Order> find(int id){
        return orders.stream()
                .filter(x->x.getId()==id)
                .findAny();
    }

    public void showData(){
        orders.forEach(o->{
            System.out.println("----Orden-----");
            System.out.println("id "+o.getId());
            System.out.println("A nombre de "+o.getReceipt().getPerson().getName());
            System.out.println("Con los productos :");
            showProducts(o);
            System.out.println("Para la ciudad de destino "+o.getDestino());
            System.out.println("El precio de la compra es : "+o.getReceipt().getTotalAmoung());
        });
    }

    public static void showProducts(Order  order){
        order.getReceipt()
                .getCarShop()
                .getListProduct()
                .forEach(a-> System.out.println(a.getName()));
    }
    public ArrayList<Order> getOrders() {
        return orders;
    }
}
