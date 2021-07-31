package com.israelspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.israelspring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
