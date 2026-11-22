package com.fiap.gerenciamento.usuario.dtos.request;

import com.fiap.gerenciamento.usuario.domain.Endereco;
import com.fiap.gerenciamento.usuario.domain.TipoUsuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String senha;

    @NotBlank
    private String login;

    @NotNull
    private TipoUsuario tipoUsuario;

    @NotNull
    @Valid
    private EnderecoRequest endereco;


}
