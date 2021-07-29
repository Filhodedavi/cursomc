package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}

//um objeto desse tipo e capaz de realizar operacoes de acesso a dados (alterar salvar, deletar, criar)
//referente ao objeto categoria que por sua vez esta mapeado com a tabela categoria no BD.
