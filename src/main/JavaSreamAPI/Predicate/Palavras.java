package main.JavaSreamAPI.Predicate;

import java.util.Arrays;
import java.util.List;

public class Palavras {

    public static void main(String[] args) {
        List<String> listaNomes = Arrays.asList("Ola", "Maravilhosamente", "Taxista", "eu");

        listaNomes.stream()
                    .filter( p -> p.length() > 5)
                    .forEach(p -> System.out.println(p));

        //usando Reduce
        List<Integer> listaNumero = Arrays.asList(1,2,3,4,5,6);
        int resultado = listaNumero.stream().reduce(0, (a,b) -> a + b);
        System.out.println(resultado);

    }





}
