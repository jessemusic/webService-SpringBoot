package br.com.jmcmusicmattec.mattec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.mattec.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
