package mfc;

import Services.ServiceCarShop;
import Services.ServiceProduct;
import Services.ServiceReceipt;
import controllers.ControllerPerson;
import controllers.ControllerReceipt;

public class Instances {

    private final ServiceCarShop serviceCarShop;

    private final ServiceProduct serviceProduct;

    private final ServiceReceipt serviceReceipt;

    private final ControllerReceipt controllerReceipt;

    private final ControllerPerson controllerPerson;


    public Instances() {
        this.serviceCarShop = new ServiceCarShop();
        this.serviceProduct = new ServiceProduct();
        this.serviceReceipt = new ServiceReceipt();
        this.controllerReceipt = new ControllerReceipt();
        this.controllerPerson = new ControllerPerson();
    }

    public ServiceCarShop getServiceCarShop() {
        return serviceCarShop;
    }

    public ServiceProduct getServiceProduct() {
        return serviceProduct;
    }

    public ServiceReceipt getServiceReceipt() {
        return serviceReceipt;
    }

    public ControllerReceipt getControllerReceipt() {
        return controllerReceipt;
    }

    public ControllerPerson getControllerPerson() {
        return controllerPerson;
    }
}
