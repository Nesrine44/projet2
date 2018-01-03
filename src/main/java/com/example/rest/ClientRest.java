package com.example.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProduitRepository;
import com.example.entities.Produit;
import com.example.entities.Site;
import com.example.rest.*;


@RestController
@RequestMapping(value="wrs/client")
public class ClientRest {
	
	// injection de ProduitRepository
	@Autowired
	ProduitRepository prddao;
	
	@RequestMapping()
	@ResponseBody
	public List<Produit> findAll(){
		
	
		return prddao.findAll();
	}
	
	
	@RequestMapping(value="{id}")
	@ResponseBody
	public Produit findByrefProduit(@PathVariable("id") Long idclient){
		
		  
		
		return prddao.findByRefProduit(idclient);
	}
	

}
