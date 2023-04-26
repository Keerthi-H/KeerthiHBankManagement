package com.example.userservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userservice.model.Customer;

@Repository
public interface UserDao extends JpaRepository<Customer, String> {

}


