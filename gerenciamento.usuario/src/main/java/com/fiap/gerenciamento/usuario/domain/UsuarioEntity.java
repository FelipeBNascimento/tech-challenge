package com.fiap.gerenciamento.usuario.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", nullable = false)
    private TipoUsuario tipoUsuario;

    @Embedded
    private Endereco endereco;






}
