package main.java.List.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidadosList;

    public ConjuntoConvidados() {
        this.convidadosList = new HashSet<>() {
        };
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadosList.add(new Convidado(nome, codigoConvidado));
    }

    public  void removerConvidado(int codigoConvidado){
        Set<Convidado> removeConvidado = new HashSet<>();
        if(!convidadosList.isEmpty()){
            for(Convidado c: convidadosList){
                if(c.getCodigoConvite() == codigoConvidado){
                    removeConvidado.add(c);
                }
            }
        }
        convidadosList.removeAll(removeConvidado);
    }

    public int contarConvidados() {
        return convidadosList.size();
    }

    public Set<Convidado> exibirConvidado(){
        return convidadosList;
    }

    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();
        System.out.println("Qtd. Convidados: "+cc.contarConvidados());
        ///*//
        cc.adicionarConvidado("Ale", 123);
        cc.adicionarConvidado("Alessandro", 1234);
        cc.adicionarConvidado("Alessandro", 123);
        System.out.println(cc.exibirConvidado());
        cc.removerConvidado(1234);
        System.out.println("Apos remover: "+cc.exibirConvidado());

        System.out.println("Qtd. Convidados: "+cc.contarConvidados());
        //*/

    }
}
