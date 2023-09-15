package main.java.Map.OperacoesBasicas;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public  void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public  void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }

    }

    public  void exibirContato(){
        System.out.println("Lista Contatos: "+agendaContatoMap);
    }

    public  void pesquisaPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap.get(nome));
        }

    }
    public void ordenaContato(){
        Map<String, Integer> agendaContatoMapOrd = new TreeMap<>();
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();
        ac.adicionarContato("Alessandro", 123456789);
        ac.adicionarContato("Alessandro S", 13333);
        ac.adicionarContato("Alexandro", 56325);
        ac.pesquisaPorNome("Alessandro S");
        ac.exibirContato();
    }
}



