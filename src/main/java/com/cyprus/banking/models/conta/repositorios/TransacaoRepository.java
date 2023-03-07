package com.cyprus.banking.models.conta.repositorios;

import com.cyprus.banking.models.conta.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
}
