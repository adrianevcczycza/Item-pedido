package com.weg.br.dto;

public record ItemPedidoRequestDto(
    private Long id;

    String nome;

     int preco;
    
) {
}