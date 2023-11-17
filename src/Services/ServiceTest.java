package Services;

import models.Product;

import javax.swing.*;
import java.util.Random;

public class ServiceTest {

    private final Random random = new Random();
    public void testProduct(Product product){
        JOptionPane.showMessageDialog(null,"Un asesor vendra en "+(random.nextInt(10)+1)+" minutos para atenderte");
        Product productClone = product.cloned();
        System.out.println("El nombre del producto es "+productClone.getName());
        System.out.println("Para ensayarlo el producto puede "+productClone.getFuntion());
    }
}
