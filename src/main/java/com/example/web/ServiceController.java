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

import com.example.dao.LiaisonRepository;
import com.example.dao.ServiceRepository;
import com.example.dao.SiteRepository;
import com.example.dao.TypeserviceRepository;
import com.example.entities.Equipement;
import com.example.entities.Liaison;
import com.example.entities.Produit;
import com.example.entities.Service;
import com.example.entities.Site;
import com.example.entities.Typeservice;
import com.example.entities.Users;

@Controller

public class ServiceController {
	

	@Autowired(required = true)
	private TypeserviceRepository typeserviceRepository;
	@Autowired(required = true)
	private SiteRepository siteRepository;



	
	public ServiceController(TypeserviceRepository typeserviceRepository,SiteRepository siteRepository){
	this.typeserviceRepository=typeserviceRepository;
	this.siteRepository=siteRepository;
	}
	
	@Autowired(required=true)
	private ServiceRepository ServiceRepository;
	@RequestMapping(value="/listservice",method=RequestMethod.GET)
	public String listservice(Model model){
		List<Service> services=ServiceRepository.findAll();
		model.addAttribute("listServices",services);
		return "listservice";
	}
	
	@RequestMapping(value="/save3",method=RequestMethod.POST)
	public String save2(Model model, @Valid @ModelAttribute("service") Service service, BindingResult result) {
		                                                                
		  ServiceRepository.save(service);      
		  
		  return  "redirect:/listservice";
		  
			}
				
		
				
	
		    
		    @RequestMapping(value="/save3")
		   	public String save3(){
		   		return "redirect:/listservice";
		   	}
	
	@RequestMapping(value="/service",method=RequestMethod.GET)
	public String service(Model model,Long refservice){
		                       
	    List<Site> site = new ArrayList<>();
        model.addAttribute("site", site);
        List<Typeservice> typeservice = new ArrayList<>();
        model.addAttribute("typeservice", typeservice);

		List<Typeservice> typeservices=typeserviceRepository.findAll();
	   	model.addAttribute("listTypeservices",typeservices);
     	List<Site> sites=siteRepository.findAll();
	   	model.addAttribute("listSites",sites);
        
			return "service";
		}
	
//	@RequestMapping(value="/save3")
//	public String save3(){
//		return "redirect:/listsite";
//	}
  
}