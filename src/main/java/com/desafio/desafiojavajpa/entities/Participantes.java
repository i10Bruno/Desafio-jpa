package com.desafio.desafiojavajpa.entities;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_participantes")

public class Participantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private String name;
    private String email;

    @ManyToMany
    @JoinTable(name = "tb_participante_atividade",joinColumns=@JoinColumn(name = "participantes_id"),
            inverseJoinColumns = @JoinColumn(name = "atividades_id"))
    private Set<Atividades> atividades = new HashSet<>();

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Participantes(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Participantes() {
    }
}
