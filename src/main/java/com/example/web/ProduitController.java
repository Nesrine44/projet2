package com.example.web;






import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.EquipementRepository;
import com.example.dao.LiaisonRepository;
import com.example.dao.ProduitRepository;
import com.example.dao.SiteRepository;
import com.example.entities.Equipement;
import com.example.entities.Liaison;
import com.example.entities.Marquequipement;
import com.example.entities.Produit;
import com.example.entities.Service;
import com.example.entities.Site;
import com.example.entities.Typeservice;                     


@Controller
public class ProduitController {
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private SiteRepository siteRepository;
	@Autowired
	private LiaisonRepository liaisonRepository;
	@Autowired
	private EquipementRepository equipementRepository;
	
	public ProduitController(ProduitRepository produitRepository,SiteRepository siteRepository) {
		this.produitRepository = produitRepository;
		this.siteRepository= siteRepository;
	
	}
	@RequestMapping(value="/client",method=RequestMethod.GET)                 
	public String client(Model model){ 
        List<Produit> produit = new ArrayList<>();
        model.addAttribute("produit", produit);
		     List<Produit> produits=produitRepository.findAll();
		     model.addAttribute("listProduits",produits);
	
	
	    return "client";
	}
	
	
	
	
	


	@RequestMapping(value="/saveproduit",method=RequestMethod.POST)
	public String save(Model model,Produit produit){	
   produitRepository.save(produit);
      return "redirect:/client";
	}

	
	
	   
    @RequestMapping(value="/saveproduit")
   	public String saveproduit(){
   		return "redirect:/client";
   	}
	
		@RequestMapping(value="/form",method=RequestMethod.GET)
		public String form(Model model,Long refProduit){
		
			
		    List<Produit> produit = new ArrayList<>();
	        model.addAttribute("produit", produit);
	   
	      
	        
		List<Produit> produits=produitRepository.findAll();
	   	model.addAttribute("listProduits",produits);
//				model.addAttribute(new Long(refProduit));
			

				   return  "formProduit";
			}
		
		
			
		@RequestMapping(value="/edit",method=RequestMethod.GET)
		public String edit(Model model,Long refProduit){
	
		produitRepository.findOne(new Long(refProduit));
		
			
			model.addAttribute(refProduit);
			//model.addAttribute("Produit",new Produit());
				return "formProduit";
			}
		
		
		
		@RequestMapping(value="/sitesuivant",method=RequestMethod.GET)
		public String sitesuivant(Model model,Long refProduit){

			List<Site> site = new ArrayList<>();
	        model.addAttribute("site", site);
	        List<Liaison> liaison = new ArrayList<>();
	        model.addAttribute("liaison", liaison);
	        
	        List<Equipement> equipement = new ArrayList<>();
	        model.addAttribute("equipement", equipement);
			
			     List<Produit> produits=produitRepository.findAll();
			     model.addAttribute("listProduits",produits);
		
			     List<Site> sites=siteRepository.findAll();
			     model.addAttribute("listSites",sites);
			     
			     List<Equipement> equipements=equipementRepository.findAll();
			     model.addAttribute("listEquipements",equipements);
			     
			     List<Liaison> liaisons=liaisonRepository.findAll();
			     model.addAttribute("listLiaisons",liaisons);
			     
			produitRepository.findOne(refProduit);
			model.addAttribute(new Long(refProduit));
			model.addAttribute("Site",new Site()); 
			return "site";
			}

	
	
         @RequestMapping(value="/delete",method=RequestMethod.GET)
            public String delete(Long refProduit){
		produitRepository.delete(refProduit);

	return "redirect:/client";
	
}


	
	@RequestMapping(value="/save")
	public String save(){
		return "redirect:/client";
	}
	
	
}
