package mfc;

import Services.*;
import controllers.*;

public class Instances {
    private final ServiceCarShop serviceCarShop;

    private final ServiceProduct serviceProduct;

    private final ServiceReceipt serviceReceipt;

    private final ControllerReceipt controllerReceipt;

    private final ControllerPerson controllerPerson;

    private final ControllerCarShop controllerCarShop;

    private final ControllerTest controllerTest;

    private final ServiceTest serviceTest;

    private final ControllerOrder controllerOrder;

    private final ServiceOrder serviceOrder;

    public Instances() {
        this.serviceCarShop = new ServiceCarShop();
        this.serviceProduct = new ServiceProduct();
        this.serviceReceipt = new ServiceReceipt();
        this.controllerReceipt = new ControllerReceipt();
        this.controllerPerson = new ControllerPerson();
        this.controllerCarShop = new ControllerCarShop();
        this.controllerTest = new ControllerTest();
        this.serviceTest = new ServiceTest();
        this.controllerOrder = new ControllerOrder();
        this.serviceOrder = new ServiceOrder();
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

    public ControllerCarShop getControllerCarShop() {
        return controllerCarShop;
    }

    public ControllerTest getControllerTest() {
        return controllerTest;
    }

    public ServiceTest getServiceTest() {
        return serviceTest;
    }

    public ControllerOrder getControllerOrder() {
        return controllerOrder;
    }

    public ServiceOrder getServiceOrder() {
        return serviceOrder;
    }
}
