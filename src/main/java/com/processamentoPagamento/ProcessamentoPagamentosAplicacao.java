package com.processamentoPagamento;

import com.processamentoPagamento.modelo.Pagamento;
import com.processamentoPagamento.repositorio.PagamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class ProcessamentoPagamentosAplicacao {

	@Autowired
	private PagamentoRepositorio pagamentoRepository;

	@PostMapping
	public Pagamento criarPagamento(@RequestBody Pagamento pagamento) {
		return pagamentoRepository.save(pagamento);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProcessamentoPagamentosAplicacao.class, args);


	}
}