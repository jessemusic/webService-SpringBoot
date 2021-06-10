package br.com.jmcmusicmattec.mattec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jmcmusicmattec.mattec.entities.User;
import br.com.jmcmusicmattec.mattec.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		 Optional<User> retorno = repository.findById(id);
		return retorno.get();
	}

}
