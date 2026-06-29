package com.weg.br.mapper;

import org.springframework.stereotype.Component;

import com.weg.br.dto.ItemPedidoRequestDto;
import com.weg.br.model.ItemPedido;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ItemPedidoMapper {  
    private final PedidoMapper pedidoMapper;

    public ItemPedido toEntity(ItemPedidoRequestDto dto)
    ItemPedido itemPedido = new ItemPedido( dto.nome(), dto.preco())
    return itemPedido;
}