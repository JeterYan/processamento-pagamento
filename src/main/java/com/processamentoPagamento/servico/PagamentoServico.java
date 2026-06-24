package com.processamentoPagamento.servico;

import com.processamentoPagamento.modelo.Pagamento;
import com.processamentoPagamento.repositorio.PagamentoRepositorio;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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

    public List<Pagamento> listarTodos() {
        return pagamentoRepositorio.findAll();
    }

    public Pagamento buscarPorId(Long id) {
        return pagamentoRepositorio.findById(id).orElse(null);
    }

    public void deletarPorId(Long id) {
        pagamentoRepositorio.deleteById(id);
    }
}

