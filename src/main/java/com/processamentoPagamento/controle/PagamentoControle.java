package com.processamentoPagamento.controle;

import com.processamentoPagamento.modelo.Pagamento;
import com.processamentoPagamento.repositorio.PagamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")


public class PagamentoControle {
    @Autowired

    private PagamentoRepositorio pagamentoRepository;

    @PostMapping
    public Pagamento criaPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
}
