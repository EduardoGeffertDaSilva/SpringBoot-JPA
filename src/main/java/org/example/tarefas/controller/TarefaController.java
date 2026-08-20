package org.example.tarefas.controller;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.tarefas.exception.TarefaNaoAchada;
import org.example.tarefas.model.Tarefa;
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

    static
    public TarefaController() {
    }

    @GetMapping("")
    public ResponseEntity<ArrayList<Tarefa>> geTarefas(){

        try {


        }catch (RuntimeException e){

            throw new TarefaNaoAchada("Erro tarefas não encontradas!");

        }
    }

}
