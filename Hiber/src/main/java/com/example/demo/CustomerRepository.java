package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.relational.core.mapping.Table;
import com.example.demo.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>  {

}
