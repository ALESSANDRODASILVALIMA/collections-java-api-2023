package main.java.Map.Ordenacao;

import java.time.LocalDate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    Map<LocalDate, Evento> eventoList;

    public AgendaEvento() {
        this.eventoList = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao){
        eventoList.put(data, new Evento(nomeEvento, nomeAtracao));
    }
    public void exibirLista(){
        Map<LocalDate, Evento> eventoListOrd = new TreeMap<>(eventoList);
        System.out.println(eventoListOrd);
    }
    public  void obterProximoEventos(){
        Map<LocalDate, Evento> proximoEventos = new TreeMap<>();
        for(LocalDate key: eventoList.keySet()){
            if(key.isAfter(LocalDate.now()) || key.isEqual(LocalDate.now())){
                proximoEventos.put(key, new Evento(eventoList.get(key).getNomeEvento(), eventoList.get(key).getNomeAtracao()));
                break;
            }
        }
        System.out.println(proximoEventos);
    }

    public static void main(String[] args) {
        AgendaEvento agE = new AgendaEvento();
        agE.adicionarEvento(LocalDate.of(2023, 10, 15), "Festa de São Francisco", "São Francisco");
        agE.adicionarEvento(LocalDate.of(2023, 9, 14), "Ferias", "Ferias kkk");
        agE.adicionarEvento(LocalDate.of(2023, 5, 15), "Natal", "Menino Jesus");

        agE.exibirLista();
        agE.obterProximoEventos();
    }



}
