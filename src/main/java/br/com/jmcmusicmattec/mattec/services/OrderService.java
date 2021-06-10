package br.com.jmcmusicmattec.mattec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jmcmusicmattec.mattec.entities.Order;
import br.com.jmcmusicmattec.mattec.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		 Optional<Order> retorno = repository.findById(id);
		return retorno.get();
	}

}
