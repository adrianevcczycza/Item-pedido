package com.weg.br.mapper;

import org.springframework.stereotype.Component;

import com.weg.br.dto.ItemPedidoRequestDto;
import com.weg.br.dto.PedidoRequestDto;
import com.weg.br.model.ItemPedido;
import com.weg.br.model.Pedido;

import lombok.RequiredArgsConstructor;
@Component
@RequiredArgsConstructor
public class PedidoMapper {
    private final ItemPedidoMapper itempedidoMapper;

    public Pedido toEntity(PedidoRequestDto dto) {
    Pedido pedido = new Pedido( dto.id(), dto.nome());

    return Pedido;
    }
}
