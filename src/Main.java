import controllers.ControllerCarShop;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ControllerCarShop controllerCarShop = new ControllerCarShop();
        while (true){
            switch (JOptionPane.showInputDialog("1. Comprar producto")){
                case "1":
                    controllerCarShop.buyProducts();
                    break;
                case "2":
                    break;
            }
        }
    }
}