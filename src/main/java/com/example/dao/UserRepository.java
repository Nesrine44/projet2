package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entities.Users;

public interface UserRepository extends JpaRepository<Users,Long>{
}