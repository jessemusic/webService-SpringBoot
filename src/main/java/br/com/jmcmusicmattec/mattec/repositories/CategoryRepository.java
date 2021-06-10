package br.com.jmcmusicmattec.mattec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.mattec.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
