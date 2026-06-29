package com.weg.br.mapper;

import org.springframework.stereotype.Component;

import com.weg.br.dto.ItemPedidoRequestDto;
import com.weg.br.model.ItemPedido;

import lombok.RequiredArgsConstructor;

public class PedidoMapper {
    @Component
@RequiredArgsConstructor
    private final ItemPedidoMapper itempedidoMapper;

    public Pedido toEntity(PedidoRequestDto dto) {
    Pedido Pedido = new Pedido( dto.id(), dto.nome());

    return Pedido;
    }
}
