package main.java.List.Set.Pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AgendaContatos {

    Set<Contato> contatoList;

    public AgendaContatos() {
        this.contatoList = new HashSet<>();
    }

    public  void adicionarContato(String nome, String numero){
    contatoList.add( new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos(){
        return  contatoList;
    }

    public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatoEncontrado = new HashSet<>();
    if(!contatoList.isEmpty()){
        for(Contato c:contatoList){
            if(c.getNome().startsWith(nome)){
                contatoEncontrado.add(c);
            }
        }
    }
    return contatoEncontrado;
    }

    public void atualizarNumeroContato(String nome, String novoNumero){
        for(Contato c: contatoList){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
            }
        }
    }


    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Alessandro", "123456");
        agenda.adicionarContato("Maria", "123456");
        agenda.adicionarContato("Erilene", "1234567");
        agenda.adicionarContato("Alexandre", "1234568");
        System.out.println(agenda.exibirContatos());
        agenda.atualizarNumeroContato("Alessandro", "123");

        System.out.println("Apos Atualizar: "+agenda.exibirContatos());
        System.out.println("Contato Buscado"+agenda.pesquisarPorNome("Erilene"));

    }

}
