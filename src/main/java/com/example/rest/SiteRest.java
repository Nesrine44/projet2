package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProduitRepository;
import com.example.dao.SiteRepository;
import com.example.entities.Produit;
import com.example.entities.Site;

@RestController
@RequestMapping(value="wrs/site")
public class SiteRest {
	
	
	
	@Autowired
    SiteRepository sitedao;
	
	@RequestMapping()
	@ResponseBody
	public List<Site> findAll(){
		
		return sitedao.findAll();
	}
	

	// un service qui je vais l'utiliser
	// les sites d'un client donné
	
	@RequestMapping(value="{id}")
	@ResponseBody
	public List<Site> findByidclient(@PathVariable("id") Long idclient){
		
		   // y-a-t-il une méthode dans le dao qui me permets de retrouver 
		                       // les sites par idclient;  sinon je dois l'ajouter 
		Produit p=new Produit();
		p.setRefProduit(idclient);
		System.out.println("recherche des sites:"+idclient);
		return sitedao.findByProduit(p);
	}
	

}
