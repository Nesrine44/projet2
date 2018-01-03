package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Dashboard;


public interface DashboardRepository   extends JpaRepository<Dashboard,Long>{

}