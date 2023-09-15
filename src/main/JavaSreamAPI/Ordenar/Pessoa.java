package main.JavaSreamAPI.Ordenar;

public class Pessoa {

    String nome;
    double altura;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                '}';
    }

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }
}
