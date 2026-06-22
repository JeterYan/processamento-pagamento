package com.processamentoPagamento.modelo;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

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
    @NotNull(message = "O valor do pagamento é obrigatório")
    @DecimalMin(value = "0.01", message = "O valor deve ser maior que zero")
    private BigDecimal valorPagamento;
    private String statusPagamento;
    private String formaPagamento;
    private LocalDateTime dataPagamento;
}
