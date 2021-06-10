package br.com.jmcmusicmattec.mattec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.mattec.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
