package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nelioalves.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	//busca no banco de dados o email como argumento,
	//e a transacao nao necessita de ser envolvida numa transacao de banco de dados
	//ficando mais rapida e diminuindo o "loocking"
	
	@Transactional(readOnly= true)
	Cliente findByEmail(String email);
}
