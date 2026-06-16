package com.processamentoPagamento.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_pagamentos")
@Data

public class Pagamento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;
    private String numeroApolice;
    private BigDecimal valorPagamento;
    private String statusPagamento;
    private String formaPagamento;
    private LocalDateTime dataPagamento;
}
