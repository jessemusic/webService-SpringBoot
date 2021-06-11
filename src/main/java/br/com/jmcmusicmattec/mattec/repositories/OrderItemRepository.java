package br.com.jmcmusicmattec.mattec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.mattec.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
