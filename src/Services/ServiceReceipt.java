package Services;

import models.Product;
import models.Receipt;

import java.util.ArrayList;

public class ServiceReceipt {
    private final ArrayList<Receipt> receiptArrayList = new ArrayList<>();
    private Integer totalAmoung = 0;
    public Receipt append(Receipt receipt){
        Integer amoung = receipt.getCarShop().getListProduct()
                .stream()
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
        receipt.setTotalAmoung(amoung);
        receiptArrayList.add(receipt);
        totalAmoung+=amoung;
        return receipt;
    }

    public void showReceipt(){
        Receipt receipt = receiptArrayList.get(receiptArrayList.size()-1);
        System.out.println("Su nombre es : "+receipt.getPerson().getName());
        System.out.println("Los productos que compro son :");
        receipt.getCarShop()
                .getListProduct()
                .forEach(p-> System.out.println(p.getName()));
        System.out.println("El total es "+receipt.getTotalAmoung());
    }

    public void showAmount(){
        System.out.println("El monto total de la empresa es "+this.totalAmoung);
    }
}
