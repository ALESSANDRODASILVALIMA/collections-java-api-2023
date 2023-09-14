package main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;
    public CarrinhoDeCompras(){
        carrinhoDeCompras = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
    this.carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item t : carrinhoDeCompras ) {
              if(t.getNome().equals(nome)){
                  itemParaRemover.add(t);
              }
        }
        carrinhoDeCompras.removeAll(itemParaRemover);
    }

    public void calcularValorTotal(){
        double total = 0;
        for (Item t: carrinhoDeCompras) {
            total = (total + t.preco) * t.quantidade;
        }
        System.out.println("Total: R$ "+total);
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionarItem("TV", 1500.0, 2);
        c.adicionarItem("TV Smart", 1800.0, 1);
        c.exibirItens();
        c.calcularValorTotal();
        c.removerItem("TV");
        System.out.println("\n\n\nItem Apos Remoção");
        c.exibirItens();

    }
}
