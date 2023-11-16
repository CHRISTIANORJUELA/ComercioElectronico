package mfc;

import Services.ServiceCarShop;
import Services.ServiceProduct;
import Services.ServiceReceipt;
import controllers.ControllerPerson;
import controllers.ControllerReceipt;

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

}
