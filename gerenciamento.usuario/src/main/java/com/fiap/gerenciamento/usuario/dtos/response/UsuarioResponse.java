package com.fiap.gerenciamento.usuario.dtos.response;

import com.fiap.gerenciamento.usuario.domain.Endereco;
import com.fiap.gerenciamento.usuario.domain.TipoUsuario;

import java.time.LocalDateTime;

public class UsuarioResponse {

    public Long id;

    public String nome;

    public LocalDateTime data;

    public TipoUsuario tipoUsuario;

    public String email;

    public EnderecoResponse endereco;


}
