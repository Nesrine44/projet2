package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.LiaisonRepository;
import com.example.dao.TypeserviceRepository;
import com.example.dao.UserRepository;
import com.example.entities.Liaison;
import com.example.entities.Typeservice;
import com.example.entities.Users;





@Controller
public class LiaisonController {
	@Autowired


private LiaisonRepository liaisonRepository;
	@RequestMapping(value="/liaisonlist",method=RequestMethod.GET)
	public String liaisonlist(Model model){
		List<Liaison> liaisons=liaisonRepository.findAll();
		model.addAttribute("listLiaisons",liaisons);	
	    return "liaisonlist";
	}		
	
	@RequestMapping(value="/nouvelleliaison",method=RequestMethod.GET)
	public String nouvelleliaison(Model model,Long refLiaison){
		
		model.addAttribute("Liaison",new Liaison());
		return "liaisonlist";
	}

	 @RequestMapping(value="/save14",method=RequestMethod.POST)
	  public String save4(Model model,Liaison liaison){	
	  
		 liaisonRepository.save(liaison);
		
		  return "redirect:/liaisonlist";
	}
		
	@RequestMapping(value="/edit5",method=RequestMethod.GET)
	public String edit5(Model model,Long refLiaison){
	       
		Liaison p=liaisonRepository.findOne(refLiaison);
		model.addAttribute("Liaison",p);
		
			//model.addAttribute("Produit",new Produit());
		return "Edit5";
		}
	
    @RequestMapping(value="/delete5")
	public String delete5(){
		return "redirect:/liaisonlist";
	}
    
    @RequestMapping(value="/save14")
   	public String save14(){
   		return "redirect:/liaisonlist";
   	}
	 
	
	
	@RequestMapping(value="/delete5",method=RequestMethod.GET)
	public String delete2(Long refLiaison){
		liaisonRepository.delete(refLiaison);
		return "redirect:/liaisonlist";
		
	
}
}
		