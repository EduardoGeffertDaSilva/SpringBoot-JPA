package org.example.tarefas.config;
import org.example.tarefas.model.Tarefa;
import org.example.tarefas.repository.TarefaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final TarefaRepository tarefaRepository;

    public DataLoader(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Tarefa> tarefas = List.of(

                new Tarefa(0L, "Estudar Spring Boot e Spring Data JPA", true, LocalDateTime.now()),
                new Tarefa(0L, "Configurar o banco H2 em memória", true, LocalDateTime.now()),
                new Tarefa(0L, "Criar endpoints do CRUD de Tarefas", false, LocalDateTime.now()),
                new Tarefa(0L, "Testar rotas na documentação do Swagger UI", false, LocalDateTime.now()),
                new Tarefa(0L, "Implementar tratamento de erros na API", false, LocalDateTime.now())
        );

        tarefaRepository.saveAll(tarefas);

    }
}