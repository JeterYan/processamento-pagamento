package com.processamentoPagamento.controle;

import com.processamentoPagamento.modelo.Pagamento;
import com.processamentoPagamento.repositorio.PagamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/pagamentos")

public class PagamentoControle {
    @Autowired

    private PagamentoRepositorio pagamentoRepositorio;

    @PostMapping
    public Pagamento criaPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepositorio.save(pagamento);
    }

    @GetMapping
    public List<Pagamento> listaPagamentos(){
        return pagamentoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Pagamento buscarPorId(@PathVariable Long id){
        return pagamentoRepositorio.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarPagamento(@PathVariable Long id){
        pagamentoRepositorio.deleteById(id);
    }

}

