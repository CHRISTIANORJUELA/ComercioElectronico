package models;

public class Receipt {

    private static int id;
    private int idSale;
    private Person person;
    private CarShop carShop;

    private int totalAmoung;

    public Receipt(Person person, CarShop carShop) {
        id++;
        this.person = person;
        this.carShop = carShop;
        this.idSale = id;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public CarShop getCarShop() {
        return carShop;
    }

    public void setCarShop(CarShop carShop) {
        this.carShop = carShop;
    }

    public int getTotalAmoung() {
        return totalAmoung;
    }

    public void setTotalAmoung(int totalAmoung) {
        this.totalAmoung = totalAmoung;
    }
}
