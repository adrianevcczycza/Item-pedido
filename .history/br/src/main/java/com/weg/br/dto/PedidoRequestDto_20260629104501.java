package com.weg.br.dto;

import java.time.LocalDate;

public record PedidoRequestDto(
    Long id,
    LocalDate dataCriacao,
    String nomeCliente
) {

    public LocalDate nome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nome'");
    }
}