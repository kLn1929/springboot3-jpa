package com.kln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kln.course.entities.OrderItem;
import com.kln.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
