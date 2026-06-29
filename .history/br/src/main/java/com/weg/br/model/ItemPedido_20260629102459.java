package com.weg.br.model;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "item-pedido")
public class ItemPedido {

    private Long id;

    private String nome
    
}
