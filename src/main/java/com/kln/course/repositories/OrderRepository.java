package com.kln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kln.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
