package br.com.jmcmusicmattec.mattec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jmcmusicmattec.mattec.entities.Product;
import br.com.jmcmusicmattec.mattec.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		 Optional<Product> retorno = repository.findById(id);
		return retorno.get();
	}

}
