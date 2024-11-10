package com.example.api_delas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "usuario")
public class Usuario {


    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "nome", length = 100, nullable = false)
        private String nome;

        @Column(name = "email", length = 100, nullable = false, unique = true)
        private String email;

        @Column(name = "senha", length = 80, nullable = false)
        private String senha;

        @Column(name = "telefone", length = 15)
        private String telefone;

        @Enumerated(EnumType.STRING)
        @Column(name = "tipo", nullable = false)
        private TipoUsuario tipo;

        @Column(name = "rua", length = 60)
        private String rua;

        @Column(name = "bairro", length = 45)
        private String bairro;

        @Column(name = "cep", length = 20)
        private String cep;

        @Column(name = "datacriacao", nullable = false)
        private LocalDateTime dataCriacao;



    public enum TipoUsuario {
        ADMIN,
        CLIENTE,
        PRESTADOR
    }
}



