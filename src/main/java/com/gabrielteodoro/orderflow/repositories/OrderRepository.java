package com.gabrielteodoro.orderflow.repositories;

import com.gabrielteodoro.orderflow.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}