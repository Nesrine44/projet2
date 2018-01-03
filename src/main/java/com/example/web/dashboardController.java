package com.example.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.EquipementRepository;
import com.example.dao.ProduitRepository;
import com.example.dao.SiteRepository;
import com.example.entities.Produit;







@Controller
public class dashboardController {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	public dashboardController(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	
	}
	@RequestMapping(value="dashboardooredoo",method=RequestMethod.GET)                 
	public String dashboardooredoo(Model model){ 
       
		 List<Produit> produit = new ArrayList<>();
	        model.addAttribute("produit", produit);
			     List<Produit> produits=produitRepository.findAll();
			     model.addAttribute("listProduits",produits);
		
	    return "dashboardooredoo";
	}
	
	
	@RequestMapping(value="/index",method=RequestMethod.GET)                 
	public String index(Model model){ 
       
	
	    return "index";
	}
	
	@RequestMapping(value="/index2",method=RequestMethod.GET)                 
	public String index2(Model model){ 
       
	    return "index2";
	}
	
	@RequestMapping(value="/chartjs",method=RequestMethod.GET)                 
	public String chartjs(Model model){ 
       
	
	    return "chartjs";
	}
	@RequestMapping(value="/tables",method=RequestMethod.GET)                 
	public String tables(Model model){ 
       
	    return "tables";
	}
	@RequestMapping(value="/tables_dynamic",method=RequestMethod.GET)                 
	public String tables_dynamic(Model model){ 
       
	    return "tables_dynamic";
	}
	
	
	
}