package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.MarquequipementRepository;
import com.example.dao.TypeserviceRepository;
import com.example.dao.UserRepository;
import com.example.entities.Marquequipement;
import com.example.entities.Typeservice;
import com.example.entities.Users;





@Controller
public class MarquequipementController {
	@Autowired


private MarquequipementRepository marquequipementRepository;
	@RequestMapping(value="/marquequipement",method=RequestMethod.GET)
	public String typeservice(Model model){
		List<Marquequipement> Marquequipements=marquequipementRepository.findAll();
		model.addAttribute("listMarquequipements",Marquequipements);	
	    return "marquequipement";
	}		
	
	@RequestMapping(value="/nouvellemarquequipement",method=RequestMethod.GET)
	public String nouvellemarquequipement(Model model,Long refMarquequipement){
		
		model.addAttribute("Marquequipements",new Marquequipement());
		return "marquequipement";
	}

	 @RequestMapping(value="/save9",method=RequestMethod.POST)
	  public String save9(Model model,Marquequipement marquequipement){	
		 marquequipementRepository.save(marquequipement);
		  return "redirect:/marquequipement";
	}
		
	@RequestMapping(value="/edit3",method=RequestMethod.GET)
	public String edit3(Model model,Long refMarquequipement){
	       
		Marquequipement p=marquequipementRepository.findOne(refMarquequipement);
		model.addAttribute("Marquequipement",p);
		
			//model.addAttribute("Produit",new Produit());
		return "Edit";
		}
	
	
    @RequestMapping(value="/delete3")
	public String delete2(){
		return "redirect:/marquequipement";
	}
    
    @RequestMapping(value="/save9")
   	public String save9(){
   		return "redirect:/marquequipement";
   	}
	 
	
	
	
	@RequestMapping(value="/delete3",method=RequestMethod.GET)
	public String delete3(Long refMarquequipement){
		marquequipementRepository.delete(refMarquequipement);
		return "redirect:/marquequipement";
		
	
}
}
		