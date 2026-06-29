package com.weg.br.dto;

import java.time.LocalDate;

public record PedidoResponseDto(
    LocalDate dataCriacao,
    String nomeCliente
) {
}
