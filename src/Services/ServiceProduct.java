package Services;

import models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ServiceProduct {
    private final ArrayList<Product> productArrayList= new ArrayList<>(Arrays.asList(
            new Product("Computador",400,"Enceder pantalla"),
            new Product("Bicicleta",200,"Rodar"),
            new Product("Tv",500,"Enceder Pantalla"),
            new Product("Corredora",900,"Encentar cinta"),
            new Product("Celular",150,"Escuchar musica")
    ));


    public Optional<Product> find(String name){
        return productArrayList.stream()
                .filter(p->p.getName().equalsIgnoreCase(name.toLowerCase()))
                .findFirst();
    }

    public void showProducts(){
        productArrayList.forEach((v)->{
            System.out.println(" Nombre "+v.getName()+" Precio "+v.getPrice());
        });
    }


}
