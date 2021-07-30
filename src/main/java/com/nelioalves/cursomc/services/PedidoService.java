package com.nelioalves.cursomc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Pedido;
import com.nelioalves.cursomc.repositories.PedidoRepository;
import com.nelioalves.cursomc.services.Exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	//declara dependencia dentro da classe e coloca autowired, essa dependencia vai ser
	//automaticamente intanciada pelo spring, pelo mecanismo de injecao de dependencia
	@Autowired 
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id 
				+ ", Tipo: " + Pedido.class.getName()));
	}
}
