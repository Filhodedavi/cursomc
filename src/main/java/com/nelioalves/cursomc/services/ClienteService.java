package com.nelioalves.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.services.Exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	//declara dependencia dentro da classe e coloca autowired, essa dependencia vai ser
	//automaticamente intanciada pelo spring, pelo mecanismo de injecao de dependencia
	@Autowired 
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id 
				+ ", Tipo: " + Cliente.class.getName()));
	}
}
