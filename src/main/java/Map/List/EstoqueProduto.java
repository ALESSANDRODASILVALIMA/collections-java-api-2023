package main.java.Map.List;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    Map<Integer, Produto> estoqueProduto;

    public EstoqueProduto() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int qtd){
        estoqueProduto.put(cod, new Produto(cod, nome, qtd, preco));
    }

    public void calcularValorTotalEstoque(){
        double total = 0;
        for (int key : estoqueProduto.keySet()){
            total = total + (estoqueProduto.get(key).getPreco() * estoqueProduto.get(key).getQtd());
        }
        System.out.println("Total: " + total);
    }

    public void obterProdutoMaiorValorDeAcordoComQuantidade(){
        double total = 0;
        double maiorTotalNaQtd = 0;
        int chave = 0;
        for (int key : estoqueProduto.keySet()){
            total = (estoqueProduto.get(key).getPreco() * estoqueProduto.get(key).getQtd());
            if(total > maiorTotalNaQtd){
                maiorTotalNaQtd = total;

                chave = key;
            }
        }
        System.out.println("Maior Total: " + estoqueProduto.get(chave));
    }

    public void obterProdutoMaisCaro(){
        double maiorValor = Double.MIN_VALUE;
        int keyMenorPreco = 0;
        for (int key : estoqueProduto.keySet()){
            if(estoqueProduto.get(key).getPreco() > maiorValor){
                maiorValor = estoqueProduto.get(key).getPreco();
                keyMenorPreco = key;
            }
        }
        System.out.println(estoqueProduto.get(keyMenorPreco));
    }

    public void obterProdutoMenosCaro(){
        double maiorValor = Double.MAX_VALUE;
        int keyMenorPreco = 0;
        for (int key : estoqueProduto.keySet()){
            if(estoqueProduto.get(key).getPreco() < maiorValor){
                maiorValor = estoqueProduto.get(key).getPreco();
                keyMenorPreco = key;
            }
        }
        System.out.println(estoqueProduto.get(keyMenorPreco));
    }

    public void exibirProduto(){
        System.out.println(estoqueProduto);
    }

    public static void main(String[] args) {
        EstoqueProduto ep = new EstoqueProduto();
        ep.adicionarProduto(1, "Café", 8.50, 2);
        ep.adicionarProduto(2, "Oleo", 9.0, 2);
        ep.adicionarProduto(4, "Café Soluvel", 7.0, 2);
        ep.exibirProduto();
        ep.calcularValorTotalEstoque();

        ep.obterProdutoMaisCaro();
        ep.obterProdutoMenosCaro();
        ep.obterProdutoMaiorValorDeAcordoComQuantidade();
    }
}
