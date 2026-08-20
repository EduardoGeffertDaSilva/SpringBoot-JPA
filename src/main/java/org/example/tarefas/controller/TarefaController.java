package org.example.tarefas.controller;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.tarefas.exception.TarefaNaoAchada;
import org.example.tarefas.model.Tarefa;
import org.example.tarefas.service.TarefaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@Tag(
        name = "Table Controller",
        description = "Here have the table connection of my API"
)

@RestController
@RequestMapping("api/v1/tarefas")
public class TarefaController {

    static TarefaService service;

    public TarefaController(TarefaService tarefaService) {
        this.service = tarefaService;
    }

    @GetMapping("")
    public ResponseEntity<ArrayList<Tarefa>> geTarefas(){

        try {

            return ResponseEntity.ok(service.getTarefas());

        }catch (RuntimeException e){

            throw new TarefaNaoAchada("Erro tarefas não encontradas!");

        }
    }

}
