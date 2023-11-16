package Services;

import models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class ServiceProduct {
    private final ArrayList<Product> productArrayList= new ArrayList<>(Arrays.asList(
            new Product("Computador",400),
            new Product("Bicicleta",200),
            new Product("Tv",500),
            new Product("Corredora",900),
            new Product("Consola gamer",150)
    ));


    public Optional<Product> find(String name){
        return productArrayList.stream()
                .filter(p->p.getName().equalsIgnoreCase(name.toLowerCase()))
                .findAny();
    }

    public void showProducts(){
        productArrayList.forEach((v)->{
            System.out.println(" Nombre "+v.getName()+" Precio "+v.getPrice());
        });
    }


}
