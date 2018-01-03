package com.example.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.EquipementRepository;
import com.example.dao.LiaisonRepository;

import com.example.dao.ProduitRepository;
import com.example.dao.SiteRepository;
import com.example.entities.Equipement;
import com.example.entities.Liaison;

import com.example.entities.Produit;
import com.example.entities.Site;



@Controller

public class SiteController {


	@Autowired(required = true)
	private ProduitRepository produitRepository;
	@Autowired(required = true)
	private LiaisonRepository liaisonRepository;
	@Autowired(required = true)
	private EquipementRepository equipementRepository;
	@Autowired
	public SiteController(ProduitRepository produitRepository,LiaisonRepository liaisonRepository,EquipementRepository equipementRepository){
	this.produitRepository=produitRepository;
	this.liaisonRepository=liaisonRepository;
	this.equipementRepository=equipementRepository;
	}

	@Autowired(required = true)
    private SiteRepository siteRepository;
	@RequestMapping(value="/listsite",method=RequestMethod.GET)
	public String listsite(Model model){                                                
		List<Site> sites=siteRepository.findAll();
		model.addAttribute("listSites",sites);
		return "listsite";
	}
	
	@RequestMapping(value = "/savesite", method = {RequestMethod.POST})
	public String save2(Model model, @Valid @ModelAttribute("site") Site site, BindingResult result) {
		 if(result.hasErrors()){
	            return "site";
		   }  else{                                                                     
		  siteRepository.save(site);                //line55    
		  
			return "redirect:/listsite";
		  }}
	
	    
		@RequestMapping(value="/site",method=RequestMethod.GET)
		public String site(Model model,Long refsite){  
			
		    List<Produit> produit = new ArrayList<>();
	        model.addAttribute("produit", produit);
	        List<Liaison> liaison = new ArrayList<>();
	        model.addAttribute("liaison", liaison);
	        List<Equipement> equipement = new ArrayList<>();
	        model.addAttribute("equipement", equipement);
	        
		List<Produit> produits=produitRepository.findAll();
	   	model.addAttribute("listProduits",produits);
		List<Liaison> liaisons=liaisonRepository.findAll();
	   	model.addAttribute("listLiaisons",liaisons);
		List<Equipement> equipements=equipementRepository.findAll();
	   	model.addAttribute("listEquipements",equipements);

				return "site";
			}
		
	@RequestMapping(value="/savesite")
	public String savesite(){
		return "redirect:/listsite";

	  
}
}
