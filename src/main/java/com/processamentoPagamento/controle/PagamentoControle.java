package com.processamentoPagamento.controle;

import com.processamentoPagamento.modelo.Pagamento;
import com.processamentoPagamento.repositorio.PagamentoRepositorio;
import com.processamentoPagamento.servico.PagamentoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/pagamentos")

public class PagamentoControle {

    private final PagamentoServico pagamentoServico;

    public PagamentoControle(PagamentoServico pagamentoServico) {
        this.pagamentoServico = pagamentoServico;
    }

    @PostMapping
    public Pagamento criaPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoServico.salvar(pagamento);
    }

    @GetMapping
    public List<Pagamento> listaPagamentos(){
        return pagamentoServico.listarTodos();
    }

    @GetMapping("/{id}")
    public Pagamento buscarPorId(@PathVariable Long id){
        return pagamentoServico.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPagamento(@PathVariable Long id){
        pagamentoServico.deletarPorId(id);
    }

}

