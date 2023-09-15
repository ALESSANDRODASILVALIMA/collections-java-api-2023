package main.java.Map.List;

public class Produto {
    private int cod;
    private String nome;
    private int qtd;
    private double preco;

    public Produto(int cod, String nome, int qtd, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", qtd=" + qtd +
                ", preco=" + preco +
                '}';
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
