package com.weg.br.mapper;

import org.springframework.stereotype.Component;

import com.weg.br.dto.ItemPedidoRequestDto;
import com.weg.br.dto.ItemPedidoResponseDto;
import com.weg.br.model.ItemPedido;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ItemPedidoMapper {  

    public ItemPedido toEntity(ItemPedidoRequestDto dto) {
    ItemPedido itemPedido =
     new ItemPedido( 
        dto.id(),
        dto.nome(),
        dto.preco());
    return itemPedido;
    }
    public ItemPedidoResponseDto toResponseDto (ItemPedido itemPedido){
        return new ItemPedidoResponseDto(
            itemPedido.getId();
            
        )
    }
}