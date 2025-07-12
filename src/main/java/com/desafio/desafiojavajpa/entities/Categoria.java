package com.desafio.desafiojavajpa.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

   private String  descricao;


    @OneToMany(mappedBy = "categoria")
    private List<Atividades> atividades;

}
