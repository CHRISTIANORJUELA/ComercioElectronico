package models;

public class Order {
    private static int idCont;

    private int id;
    String destino;
    Receipt receipt;
    int days;

    public Order(String destino, Receipt receipt, int days) {
        idCont++;
        this.id = idCont;
        this.destino = destino;
        this.receipt = receipt;
        this.days = days;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getId() {
        return id;
    }
}
