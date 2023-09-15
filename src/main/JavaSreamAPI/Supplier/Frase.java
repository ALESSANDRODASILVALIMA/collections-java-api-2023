package main.JavaSreamAPI.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Frase {
    public static void main(String[] args) {
        List<String> frase = Stream.generate(
                () -> {
                return "Ola";
                        }
        ).limit(5).toList();

        frase.forEach(System.out::println);
    };

}
