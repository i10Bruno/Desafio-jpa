package com.desafio.desafiojavajpa.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_atividades")

public class Atividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    private String descricao;
    private double preco;


    @ManyToMany(mappedBy = "atividades")
    private Set<Participantes> participantes = new HashSet<>();

    @ManyToOne()
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
    private List<Bloco> blocos = new ArrayList<>();

    public Atividades(double preco, String descricao, String name, long id) {
        this.preco = preco;
        this.descricao = descricao;
        this.name = name;
        this.id = id;
    }

    public Atividades() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
