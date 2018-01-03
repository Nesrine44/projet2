package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.EtatRepository;
import com.example.dao.PassationRepository;
import com.example.dao.ProduitRepository;
import com.example.entities.Etat;
import com.example.entities.Passation;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.dao.SiteRepository;
import com.example.dao.TypeserviceRepository;

import com.example.entities.Produit;
import com.example.entities.Service;
import com.example.entities.Site;
import com.example.entities.Typeservice;
import com.example.entities.Users;



@Controller

public class PassationController {
	

	@Autowired(required = true)
	private TypeserviceRepository typeserviceRepository;
	@Autowired(required = true)
	private SiteRepository siteRepository;
;
    @Autowired(required = true)
    private EtatRepository etatRepository;

	@Autowired(required = true)
	private ProduitRepository produitRepository;

	
	
	public PassationController(TypeserviceRepository typeserviceRepository,SiteRepository siteRepository,
			ProduitRepository produitRepository,EtatRepository etatRepository){
	this.typeserviceRepository=typeserviceRepository;
	this.siteRepository=siteRepository;
	this.produitRepository=produitRepository;
	this.etatRepository=etatRepository;
	}
	
	@Autowired(required=true)
	private PassationRepository passationRepository;
	@RequestMapping(value="/passation",method=RequestMethod.GET)
	public String passation(Model model){
		
		List<Passation> passations=passationRepository.findAll();
		model.addAttribute("listPassations",passations);

		   // This should be in your service layer.  Example only:
	/*	   Passation passation = new Passation();
		   passation.setDateretour(new Date());
		   passation.setDatevalidation(new Date());
		   //make sure the model has the bean
*/		//   model.addAttribute("passation", passation); 
			return "passation";	
	}
	
	@RequestMapping(value="/save5",method=RequestMethod.POST)
	public String save5(Model model, @Valid @ModelAttribute("passation") Passation passation, BindingResult result) {
		 if(result.hasErrors()){
	            return "nouvellepassation";
		   }  else{                                                                        
		  passationRepository.save(passation); 

		  return  "redirect:/passation";
		  }}
		
	
	@RequestMapping(value="/savepassationencours",method=RequestMethod.POST)
	public String savepassation(Model model, @Valid @ModelAttribute("passation") Passation passation, BindingResult result) {
		                                          
		  passationRepository.save(passation);   
	
		  return  "redirect:/passation";
		  }
		
	
	   
    @RequestMapping(value="/save5")
   	public String save5(){
   		return "redirect:/passation";
   	}
    
    @RequestMapping(value="/savepassationencours")
   	public String savepassation(){
   		return "redirect:/passation";
   	}
	  
	@RequestMapping(value="/nouvellepassation",method=RequestMethod.GET)
	public String nouvellepassation(Model model,Long refpassation){

	    List<Site> site = new ArrayList<>();
        model.addAttribute("site", site);
        List<Typeservice> typeservice = new ArrayList<>();
        model.addAttribute("typeservice", typeservice);
        List<Produit> produit = new ArrayList<>();
        model.addAttribute("produit", produit);
      List<Etat> Etat = new ArrayList<>();
        model.addAttribute("Etat", Etat);


        
        List<Etat> etats=etatRepository.findAll();
	   	model.addAttribute("listEtats",etats);
		List<Typeservice> typeservices=typeserviceRepository.findAll();
	   	model.addAttribute("listTypeservices",typeservices);
     	List<Site> sites=siteRepository.findAll();
	   	model.addAttribute("listSites",sites);
		List<Produit> produits=produitRepository.findAll();
	   	model.addAttribute("listProduits",produits);
        
	   	return "nouvellepassation";
		}

  

			@RequestMapping(value="/nonvalidepassation",method=RequestMethod.GET)
			public String nonvalidepassation(Model model,Long refPassation){
				Passation p=passationRepository.findOne(refPassation);
				model.addAttribute("Passation",p);
				return "nonvalidepassation";
		}

			
			

			@RequestMapping(value="/passationencours",method=RequestMethod.GET)
			public String passationencours(Model model,Long refPassation){
				   
				 
			    List<Site> site = new ArrayList<>();
		        model.addAttribute("site", site);
		        List<Typeservice> typeservice = new ArrayList<>();
		        model.addAttribute("typeservice", typeservice);
		        List<Produit> produit = new ArrayList<>();
		        model.addAttribute("produit", produit);
		        List<Passation> passation = new ArrayList<>();
		        model.addAttribute("passation", passation);
		       
		        List<Etat> Etat = new ArrayList<>();
		        model.addAttribute("Etat", Etat);


		        
		        List<Etat> etats=etatRepository.findAll();
			   	model.addAttribute("listEtats",etats);
				List<Typeservice> typeservices=typeserviceRepository.findAll();
			   	model.addAttribute("listTypeservices",typeservices);
		     	List<Site> sites=siteRepository.findAll();
			   	model.addAttribute("listSites",sites);
				List<Produit> produits=produitRepository.findAll();
			   	model.addAttribute("listProduits",produits);
			   	
				List<Passation> passations=passationRepository.findAll();
			   	model.addAttribute("listPassations",passations);
			
				return "passationencours";
		}
			
			@RequestMapping(value="/deletepassation",method=RequestMethod.GET)
			public String deletepassation(Long refPassation){
				passationRepository.delete(refPassation);
				return "redirect:/passation";
			}
}

