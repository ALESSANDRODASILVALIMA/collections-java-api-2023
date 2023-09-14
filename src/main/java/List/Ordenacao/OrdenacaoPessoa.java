package main.java.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));

    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadasIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasOrdenadasIdade);
        return pessoasOrdenadasIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasOrdenadasAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasOrdenadasAltura, new comparaAltura());
        return pessoasOrdenadasAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();
        op.adicionarPessoas("nome 1", 25, 1.73);
        op.adicionarPessoas("nome 2", 28, 1.60);
        op.adicionarPessoas("nome 3", 21, 1.83);
        op.adicionarPessoas("nome 4", 85, 1.53);

        //System.out.println(op.ordenarPorAltura());
        System.out.println(op.ordenarPorIdade());
    }
}
