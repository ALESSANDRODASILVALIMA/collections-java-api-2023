package main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa t: tarefaList) {
            if(t.getDescricao().equals(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }


    public Integer obterNumeroTotalTarefas(){
        return  tarefaList.size();
    }

    public void obterDescricoesTarefas(){

        for (Tarefa t: tarefaList) {
            System.out.println(t.getDescricao());
        }

    }
    public void obterDescricoesTarefas2(){
         System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Lavar Cabelo");
        listaTarefa.adicionarTarefa("Lavar Cabelo");
        listaTarefa.adicionarTarefa("Secar Cabelo");
        listaTarefa.adicionarTarefa("Pentear Cabelo");

        listaTarefa.obterDescricoesTarefas();
        listaTarefa.obterNumeroTotalTarefas();
        listaTarefa.removerTarefa("Lavar Cabelo");
        System.out.println("----------Apos Remoção---------");
        listaTarefa.obterDescricoesTarefas();

        System.out.println("----------Listando de outra forma---------");
        listaTarefa.obterDescricoesTarefas2();
    }

}
