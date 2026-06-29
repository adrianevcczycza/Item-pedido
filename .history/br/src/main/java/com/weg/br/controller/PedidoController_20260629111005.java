package com.weg.br.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.br.dto.PedidoRequestDto;
import com.weg.br.dto.PedidoResponseDto;
import com.weg.br.service.PedidoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("pedido")
@RequiredArgsConstructor
public class PedidoController {
    private final PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoResponseDto> createPedido(
        @RequestBody PedidoRequestDto pedidoRequestDto
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(pedidoService.createPedido(pessoaReque))
    }
    
}
