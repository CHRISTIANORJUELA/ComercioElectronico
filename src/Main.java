import mfc.ModelFactoryController;
import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ModelFactoryController mfc = ModelFactoryController.getInstance();
        while (true){
            switch (JOptionPane.showInputDialog("Presiona \n 1. Agregar productos al carrito \n 2.Probar un probar")){
                case "1":
                    mfc.getControllerCarShop().buyProducts();
                    break;
                case "2":
                   mfc.getControllerTest().test();
                    break;
            }
        }
    }
}