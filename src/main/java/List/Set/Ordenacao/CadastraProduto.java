package main.java.List.Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastraProduto {
    Set<Produto> produtosList;

    public CadastraProduto() {
        this.produtosList = new TreeSet<>();
    }
    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        produtosList.add(new Produto(cod, nome, preco, quantidade));
    }
    public void exibirProdutosPorNome(){
        Set<Produto> produtoOrdenado = new TreeSet<>(produtosList);
        System.out.println("Ordenando por nome: "+ produtoOrdenado);
    }
    public void exibirProdutosPorPreco(){
                                                    //implementa o metodo de comparação que vai gerar um lista vazia de produtos ordenado por preco.
                                                    //Adiciona qualquer lista do tipo produto nesta lista vazia va fazer ela se organiza pro perco.
        Set<Produto> produtoOrdenado = new TreeSet<>(new comparaPorPreco());

        produtoOrdenado.addAll(produtosList);
        System.out.println("Ordenando por preco: "+ produtoOrdenado);
    }

    public static void main(String[] args) {
        CadastraProduto cp = new CadastraProduto();
        cp.adicionarProduto(1, "Macarrão", 20.0, 5);
        cp.adicionarProduto(2, "Arroz", 25, 2);
        cp.exibirProdutosPorNome();
        cp.exibirProdutosPorPreco();

    }
}
