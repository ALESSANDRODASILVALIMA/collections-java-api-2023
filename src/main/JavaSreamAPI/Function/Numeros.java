package main.JavaSreamAPI.Function;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Numeros {
    public static void main(String[] args) {

        List<Integer> listaNumero = Arrays.asList(1,2,3,4,6);

        Function<Integer, Integer> dobrar = numero -> numero * 2;
        //Map rececbe um metodo como paramentro eu posso criar o metodos e passar ele.
        List<Integer> numeroDobrado = listaNumero.stream().map(dobrar).toList();


        //usando Lambda - Dessa forma eu crio o metodo lambda e passo diretamente
        List<Integer> numeroDobradoComLambda = listaNumero.stream().map(n -> n*2).toList();
        numeroDobrado.forEach(n -> System.out.println(n));

    }
}
