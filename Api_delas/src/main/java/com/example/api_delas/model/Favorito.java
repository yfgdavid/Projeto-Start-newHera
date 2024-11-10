package com.example.api_delas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "favorito")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Favorito {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idfavorito;

        @ManyToOne
        @JoinColumn(name = "idservicofavorito", nullable = false)
        private Servicos servicoFavorito;

        @ManyToOne
        @JoinColumn(name = "idprestadorfavorito", nullable = false)
        private Usuario usuarioFavorito;


        @Column(name = "datafavoritamento")
        private LocalDateTime datafavoritamento;


    }


