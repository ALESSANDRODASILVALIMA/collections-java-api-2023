package main.java.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros(){
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivos(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }
    public void pesquisarPorAutor(String nomeAutor){
        List<Livro> autorEncontrado = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for (Livro l: listaLivros ) {
                if(l.getAutor().equals(nomeAutor)){
                    autorEncontrado.add(l);
                }
            }
            System.out.println(autorEncontrado);
        }else{
            System.out.println("Lista de Livros Vazia!");
        }

    }

    public void pesquisarPorIntervalosDeAnos(int anoInicial, int anoFinal){
        List<Livro> intervaloAno = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for (Livro l: listaLivros ) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    intervaloAno.add(l);

                }

            }
            System.out.println(intervaloAno);
        }else{
            System.out.println("Lista de Livros Vazia!");
        }

    }

    //Pequisar por titulo e retornar o primeiro livro encontrado
    public void pesqusiarPorTitulo(String titulo){
        List<Livro> porTitulo = new ArrayList<>();
        if(!listaLivros.isEmpty()) {

            for (Livro l : listaLivros) {
                    if (l.getTitulo().equalsIgnoreCase(titulo)) {

                        porTitulo.add(l);
                        break;
                    }

            }
            System.out.println("\nPesquisa por Titulo: ");
            System.out.println(porTitulo);
        }else{

            System.out.println("Lista de Livros vazia");
        }
    }


    public List<Livro> pesqusiarPorTituloComRetorno(String titulo){
        List<Livro> porTitulo = new ArrayList<>();
        if(!listaLivros.isEmpty()) {

            for (Livro l : listaLivros) {
                if (l.getTitulo().equals(titulo)) {

                    porTitulo.add(l);
                    break;
                }

            }

        }else{

            System.out.println("Lista de Livros vazia");
            return  porTitulo = null;
        }
        return porTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros cl = new CatalogoLivros();
        cl.adicionarLivos("Java", "Ale", 2007);
        cl.adicionarLivos("Java", "Ale", 2009);
        cl.adicionarLivos("Java", "Ale", 2010);

        cl.adicionarLivos("TS", "Erilene", 2017);

        cl.pesquisarPorAutor("Erilene");
        cl.pesquisarPorIntervalosDeAnos(2010, 2020);

        cl.pesqusiarPorTitulo("TS");

        System.out.println("Lista Retornada: "+cl.pesqusiarPorTituloComRetorno("TS"));
    }

}
