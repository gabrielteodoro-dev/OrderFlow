package com.gabrielteodoro.orderflow.repositories;

import com.gabrielteodoro.orderflow.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}