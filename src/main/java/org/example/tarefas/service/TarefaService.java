package org.example.tarefas.service;

import org.example.tarefas.exception.TarefaNaoAchada;
import org.example.tarefas.model.Tarefa;
import org.example.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    private TarefaRepository repository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.repository = tarefaRepository;
    }

    public ArrayList<Tarefa> getTarefas(){

        List<Tarefa> tarefas = repository.findAll();
        ArrayList<Tarefa> listaTarefas = new ArrayList<>(tarefas);

        if(listaTarefas.isEmpty()){

            throw new TarefaNaoAchada("Erro tarefas não encontradas");

        }

        return listaTarefas;

    }
}
