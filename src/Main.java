import mfc.ModelFactoryController;
import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ModelFactoryController mfc = ModelFactoryController.getInstance();
        while (true){
            switch (JOptionPane.showInputDialog("Presiona \n 1. Agregar productos al carrito \n 2.Probar un probar \n 3.Mostrar ordenes \n 4. Consultar una orden por su id \n 5. Despachar la primer orden la fila \n 6. Mostrar recaudo de la empresa")){
                case "1":
                    mfc.getControllerCarShop().buyProducts();
                    break;
                case "2":
                   mfc.getControllerTest().test();
                    break;
                case "3":
                    mfc.getControllerOrder().showOrders();
                    break;
                case "4":
                    mfc.getControllerOrder().consult();
                    break;
                case "5":
                    mfc.getControllerOrder().dispatcher();
                    break;
                case "6":
                    mfc.getControllerReceipt().showAmoung();
            }
        }
    }
}