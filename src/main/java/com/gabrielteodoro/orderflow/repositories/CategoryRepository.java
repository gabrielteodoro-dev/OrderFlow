package com.gabrielteodoro.orderflow.repositories;

import com.gabrielteodoro.orderflow.entities.Category;
import com.gabrielteodoro.orderflow.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}