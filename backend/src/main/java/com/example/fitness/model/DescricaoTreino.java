package com.example.fitness.model;

import jakarta.persistence.*;

@Entity
public class DescricaoTreino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private PlanoTreino planoTreino;

}