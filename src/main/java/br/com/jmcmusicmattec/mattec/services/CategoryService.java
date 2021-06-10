package br.com.jmcmusicmattec.mattec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jmcmusicmattec.mattec.entities.Category;
import br.com.jmcmusicmattec.mattec.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		 Optional<Category> retorno = repository.findById(id);
		return retorno.get();
	}

}
