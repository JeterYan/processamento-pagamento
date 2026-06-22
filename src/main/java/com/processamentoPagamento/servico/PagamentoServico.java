package com.processamentoPagamento.servico;

import com.processamentoPagamento.modelo.Pagamento;
import com.processamentoPagamento.repositorio.PagamentoRepositorio;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PagamentoServico {

    private final PagamentoRepositorio pagamentoRepositorio;

    public PagamentoServico(PagamentoRepositorio pagamentoRepositorio) {
        this.pagamentoRepositorio = pagamentoRepositorio;
    }

    public Pagamento salvar(Pagamento pagamento) {
        if (pagamento.getValorPagamento() == null || pagamento.getValorPagamento().compareTo(BigDecimal.ZERO) <= 0) {
            return null;
        }
        return pagamentoRepositorio.save(pagamento);
    }
}

