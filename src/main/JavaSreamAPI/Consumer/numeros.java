package main.JavaSreamAPI.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class numeros {
    List<Integer> numero = Arrays.asList(1,2,3,4,5,6,7,9,10,11,12);

    Consumer<Integer> numeropar = numero ->{
        if(numero % 2 == 0){
            System.out.println(numero);
        }
    };

    public static void main(String[] args) {
        numeros n = new numeros();
        //n.numero.stream().forEach(n.numeropar);

        //Usando Cosumer
        n.numero.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                if(num % 2 == 0){
                    System.out.println("Usando Cosumer: "+ num);
                }
            }
        });

        //Usando Lambada
        n.numero.forEach( num -> {
                if(num % 2 == 0){
                    System.out.println("Usando Cosumer: "+num);
                }
            }
        );
    }


}
