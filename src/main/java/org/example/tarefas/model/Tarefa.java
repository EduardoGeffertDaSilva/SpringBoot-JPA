package org.example.tarefas.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String descricao;

    @Column
    private boolean concluida = false;

    @Column
    private LocalDateTime dataCriacao = LocalDateTime.now();

    public Tarefa() {}

    public Tarefa(long id, String descricao, boolean concluida, LocalDateTime dataCriacao) {
        this.id = id;
        this.descricao = descricao;
        this.concluida = concluida;
        this.dataCriacao = dataCriacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
