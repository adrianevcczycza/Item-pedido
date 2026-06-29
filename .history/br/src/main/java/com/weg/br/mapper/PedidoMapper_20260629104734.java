package com.weg.br.mapper;

import org.springframework.stereotype.Component;


import com.weg.br.dto.PedidoRequestDto;
import com.weg.br.model.Pedido;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PedidoMapper {
  
    public Pedido toEntity(PedidoRequestDto dto) {
    Pedido pedido = new Pedido( dto.id(), dto.dataCriacao(), dto.nomeCliente());

    return pedido;
    }

    public pedid
}
