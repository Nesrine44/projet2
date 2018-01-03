package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Produit;




public interface ProduitRepository extends JpaRepository<Produit,Long> {
       
	
public Produit findByRefProduit(Long refProduit);
	
	




}



