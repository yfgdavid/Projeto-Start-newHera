package com.example.api_delas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contratacao")
public class Contratacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcontratacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario id;

    @ManyToOne
    @JoinColumn(name = "servicos_idservicos", nullable = false)
    private Servicos idservicos;


    @Column(name = "status", length = 20)
    private String status;


    @Column(name = "datacriacao", nullable = false)
    private LocalDateTime dataContratacao;


    @Column(name = "comentarios", nullable = false)
    private String comentarios;



    }

