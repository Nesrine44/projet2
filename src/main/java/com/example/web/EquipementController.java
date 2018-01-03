package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dao.EquipementRepository;
import com.example.dao.SiteRepository;
import com.example.entities.Equipement;
import com.example.entities.Produit;
import com.example.entities.Site;

@Controller

public class EquipementController {
	
	@Autowired
	
	
	private EquipementRepository equipementRepository;
	@RequestMapping(value="/equipementlist",method=RequestMethod.GET)
	public String equipementlist(Model model){
		model.addAttribute("Equipement",new Equipement());

	     List<Equipement> Equipements=equipementRepository.findAll();
	     model.addAttribute("listEquipements",Equipements);
		return "Equipementlist";
	}
	  @RequestMapping(value="/save4",method=RequestMethod.POST)
	  public String save4(Model model,Equipement equipement){	
		  equipementRepository.save(equipement);
	      return "redirect:/equipementlist";
	}	  
	 
		@RequestMapping(value="/editequipement",method=RequestMethod.GET)
		public String editequipement(Model model,Long refEquipement){
		
				Equipement p=equipementRepository.findOne(refEquipement);
		
				model.addAttribute("Equipementt",p);
				return "editequipement";
			}

	
	
       @RequestMapping(value="/deletequipement",method=RequestMethod.GET)
          public String deletequipement(Long refEquipement){
		   equipementRepository.delete(refEquipement);
  
	       return "redirect:/equipementlist";
	
}
       
       @RequestMapping(value="/deletequipement")
   	public String deletequipement(){
   		return "redirect:/equipementlist";
   	}
       
       @RequestMapping(value="/save4")
      	public String save4(){
      		return "redirect:/equipementlist";
      	}
	  
	  
}

