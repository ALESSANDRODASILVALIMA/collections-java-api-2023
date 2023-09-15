package main.JavaSreamAPI.Ordenar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaPorAltura {
    List<Pessoa> listPessoa;

    public OrdenaPorAltura() {
        this.listPessoa = new ArrayList<>();
    }

    public void cadastraPessoa(String nome, double altura){
        listPessoa.add(new Pessoa(nome, altura));
    }

    public List<Pessoa> ordenarPorAltura() {
        if (!listPessoa.isEmpty()) {
            List<Pessoa> ornadaPorAltura = new ArrayList<>(listPessoa);
            ornadaPorAltura.sort((p1, p2) -> {
                return Double.compare(p1.altura, p2.altura);
            });
            return ornadaPorAltura;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Pessoa> ordenarPorAlturaSream() {
        if (!listPessoa.isEmpty()) {
            List<Pessoa> ornadaPorAltura = new ArrayList<>(listPessoa);
            ornadaPorAltura.sort(Comparator.comparing(Pessoa::getaltura));
            return ornadaPorAltura;
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }


    public static void main(String[] args) {
        OrdenaPorAltura ordAltuar = new OrdenaPorAltura();

        ordAltuar.cadastraPessoa("Ale", 1.75);
        ordAltuar.cadastraPessoa("Errilene", 1.50);
        ordAltuar.cadastraPessoa("ierlia", 1.65);
        //System.out.println(ordAltuar.ordenarPorAltura());
        System.out.println(ordAltuar.ordenarPorAlturaSream());
    }
}
