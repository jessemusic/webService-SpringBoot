package br.com.jmcmusicmattec.mattec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.mattec.entities.Order;

public interface OrderRepository  extends JpaRepository<Order,Long>{

}
