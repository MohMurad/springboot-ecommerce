package com.springboot.ecommerce.dao;

import com.springboot.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //behind the scenes  springboot will execute a query similar to this
    //select * from customer c where  c.email=theEmail
    Customer findByEmail(String theEmail);
}
