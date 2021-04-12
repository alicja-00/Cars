package com.example.demo;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>  {

}
