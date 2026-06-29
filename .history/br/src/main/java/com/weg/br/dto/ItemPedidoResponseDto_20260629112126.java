package com.weg.br.dto;

public record ItemPedidoResponseDto(
    String nome,
    int preco  
) {

    public ItemPedidoResponseDto(Long id) {
        //TODO Auto-generated constructor stub
    }
}
