package com.processamentoPagamento.repositorio;

import com.processamentoPagamento.modelo.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepositorio extends JpaRepository<Pagamento, Long> {

}
