package com.weg.br.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.br.dto.ItemPedidoRequestDto;
import com.weg.br.dto.ItemPedidoResponseDto;
import com.weg.br.service.ItemPedidoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ItemPedido")
public class ItemPedidoController {
    private final ItemPedidoService itemPedidoService;

    @PostMapping
    public ResponseEntity<ItemPedidoResponseDto> createItemPedido(
        @RequestBody ItemPedidoRequestDto ItemPedidoRequestDto
    ){
        return RequestBody item
    }
}
