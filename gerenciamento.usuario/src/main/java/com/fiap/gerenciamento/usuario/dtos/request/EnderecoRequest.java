package com.fiap.gerenciamento.usuario.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoRequest {

    @NotBlank
    private String rua;

    @NotBlank
    private String cep;

    @NotBlank
    private String cidade;

    @NotBlank
    private String numero;
}
