package controllers;

import models.Person;

import javax.swing.*;

public class ControllerPerson {

    public Person putPerson(){
        String nameClient = JOptionPane.showInputDialog("Ingrese su nombre de la persona");
        String document = JOptionPane.showInputDialog("Ingrese su documento");
        return new Person(document,nameClient);
    }
}
