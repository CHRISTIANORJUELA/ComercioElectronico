package Services;

import models.Product;
import models.Receipt;

import java.util.ArrayList;

public class ServiceReceipt {
    private final ArrayList<Receipt> receiptArrayList = new ArrayList<>();

    public void append(Receipt receipt){
        Integer amoung = receipt.getCarShop().getListProduct()
                .stream()
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
        receipt.setTotalAmoung(amoung);
        receiptArrayList.add(receipt);
    }

    public void showReceipt(){
        Receipt receipt = receiptArrayList.get(receiptArrayList.size()-1);
        System.out.println("Su nombre es : "+receipt.getPerson().getName());
        System.out.println("Los productos que compro son :");
        receipt.getCarShop()
                .getListProduct()
                .forEach(x-> x.getName());
        System.out.println("El total es "+receipt.getTotalAmoung());
    }
}
