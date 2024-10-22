package com.example.fitness.model;

import jakarta.persistence.*;

@Entity
public class PlanoTreino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario usuario;

}
