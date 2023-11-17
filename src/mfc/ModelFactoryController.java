package mfc;

import Services.*;
import controllers.*;

public class ModelFactoryController {
    Instances instances;

    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        instances = new Instances();
    }

    //*****************_______________________________**********************


    public ServiceProduct getServiceProduct(){
        return ModelFactoryController.getInstance().instances.getServiceProduct();
    }


    public ServiceReceipt getServiceReceipt(){
        return ModelFactoryController.getInstance().instances.getServiceReceipt();
    }

    public ServiceCarShop getServiceCarShop(){
        return ModelFactoryController.getInstance().instances.getServiceCarShop();
    }

    public ControllerReceipt getControllerReceipt(){
        return ModelFactoryController.getInstance().instances.getControllerReceipt();
    }

    public ControllerPerson getControllerPerson(){
        return ModelFactoryController.getInstance().instances.getControllerPerson();
    }

    public ControllerCarShop getControllerCarShop(){
        return ModelFactoryController.getInstance().instances.getControllerCarShop();
    }

    public ControllerTest getControllerTest(){
        return ModelFactoryController.getInstance().instances.getControllerTest();
    }

    public ServiceTest getServiceTest(){
        return ModelFactoryController.getInstance().instances.getServiceTest();
    }

    public ServiceOrder getServiceOrder(){return ModelFactoryController.getInstance().instances.getServiceOrder();}

    public ControllerOrder getControllerOrder(){return ModelFactoryController.getInstance().instances.getControllerOrder();}
}
