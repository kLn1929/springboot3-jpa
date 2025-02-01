package com.kln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kln.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
