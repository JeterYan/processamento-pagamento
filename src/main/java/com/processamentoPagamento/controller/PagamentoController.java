package com.processamentoPagamento.controller;

import com.processamentoPagamento.modelo.Pagamento;
import com.processamentoPagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")


public class PagamentoController {
    @Autowired

    private PagamentoRepository pagamentoRepository;

    @PostMapping
    public Pagamento criaPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
}
