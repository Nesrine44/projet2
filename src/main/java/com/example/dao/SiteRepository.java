package com.example.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Produit;
import com.example.entities.Site;

@Repository

public interface SiteRepository extends JpaRepository<Site,Long>{
	
	// il y a une convention pour jparepository pour créer cette méthode facilement
	// findBy<nomde la l'attribut>
	
	List<Site> findByProduit(Produit p);
	


}
