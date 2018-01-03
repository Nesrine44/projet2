package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.TypeserviceRepository;
import com.example.dao.UserRepository;
import com.example.entities.Typeservice;
import com.example.entities.Users;





@Controller
public class TypeserviceController {
	@Autowired


private TypeserviceRepository typeserviceRepository;
	@RequestMapping(value="/typeservice",method=RequestMethod.GET)
	public String typeservice(Model model){
		List<Typeservice> typeservices=typeserviceRepository.findAll();
		model.addAttribute("listTypeservices",typeservices);	
	    return "typeservice";
	}		
	
	@RequestMapping(value="/nouvelletypeservice",method=RequestMethod.GET)
	public String nouvelletypseservice(Model model,Long refTypeservice){
		
		model.addAttribute("Typeservice",new Typeservice());
		return "typeservice";
	}

	 @RequestMapping(value="/save8",method=RequestMethod.POST)
	  public String save8(Model model,Typeservice typeservice){	
		  typeserviceRepository.save(typeservice);
		  return "redirect:/typeservice";
	}
		
	@RequestMapping(value="/edit2",method=RequestMethod.GET)
	public String edit2(Model model,Long refTypeservice){
	       
		Typeservice p=typeserviceRepository.findOne(refTypeservice);
		model.addAttribute("Typeservice",p);
		
			//model.addAttribute("Produit",new Produit());
		return "Edit2";
		}

    @RequestMapping(value="/delete2")
	public String delete2(){
		return "redirect:/typeservice";
	}
    
    @RequestMapping(value="/save8")
   	public String save8(){
   		return "redirect:/typeservice";
   	}
	 
	
	
	
	@RequestMapping(value="/delete2",method=RequestMethod.GET)
	public String delete2(Long refTypeservice){
		typeserviceRepository.delete(refTypeservice);
		return "redirect:/typeservice";
		
	
}
}
		