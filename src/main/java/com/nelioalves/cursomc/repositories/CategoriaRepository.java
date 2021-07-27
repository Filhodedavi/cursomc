package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}

//um objeto desse tipo e capaz de realizar operacoes de acesso a dados (alterar salvar, deletar, criar)
//referente ao objeto categoria que por sua vez esta mapeado com a tabela categoria no BD.
