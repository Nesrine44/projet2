package com.example.web;






import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.EquipementRepository;
import com.example.dao.InventaireRepository;
import com.example.dao.LiaisonRepository;
import com.example.dao.ProduitRepository;
import com.example.dao.ServiceRepository;
import com.example.dao.SiteRepository;
import com.example.dao.TypeserviceRepository;
import com.example.entities.Equipement;
import com.example.entities.Inventaire;
import com.example.entities.Liaison;

import com.example.entities.Produit;
import com.example.entities.Service;
import com.example.entities.Site;
import com.example.entities.Typeservice;                     


@Controller
public class InventaireController {
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private SiteRepository siteRepository;
	@Autowired
	private LiaisonRepository liaisonRepository;
	@Autowired
	private EquipementRepository equipementRepository;
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private TypeserviceRepository typeserviceRepository;


	public InventaireController(InventaireRepository inventaireRepository,ProduitRepository produitRepository,SiteRepository siteRepository,LiaisonRepository liaisonRepository,
			EquipementRepository equipementRepository,ServiceRepository serviceRepository,TypeserviceRepository typeserviceRepository) {
		this.produitRepository = produitRepository;
		this.siteRepository= siteRepository;
		this.liaisonRepository = liaisonRepository;
		this.equipementRepository= equipementRepository;
		this.serviceRepository = serviceRepository;
		this.typeserviceRepository= typeserviceRepository;
		this.inventaireRepository= inventaireRepository;
		
		
	}
	
	
	@Autowired
	private InventaireRepository inventaireRepository;
	@RequestMapping(value="/inventairelist",method=RequestMethod.GET)                  //Inventery
    public String inventairelist(Model model){ 
		 model.addAttribute("Inventaire",new Inventaire());
		List<Site> site = new ArrayList<>();
        model.addAttribute("site", site);
		
        List<Produit> produit = new ArrayList<>();
        model.addAttribute("produit", produit);
        
    	List<Equipement> equipement = new ArrayList<>();
       model.addAttribute("equipement", equipement);
		
        List<Liaison> liaison= new ArrayList<>();
        model.addAttribute("liaison", liaison);
        

       List<Service> service= new ArrayList<>();
        model.addAttribute("service", service);

        List<Typeservice> typeservice= new ArrayList<>();
        model.addAttribute("typeservice", typeservice);
        
		
	     List<Produit> produits=produitRepository.findAll();
		     model.addAttribute("listProduits",produits);
		     
		     List<Equipement> equipements=equipementRepository.findAll();
		     model.addAttribute("listEquipements",equipements);
		     

		     List<Liaison> liaisons=liaisonRepository.findAll();
		     model.addAttribute("listLiaisons",liaisons);
			     List<Site> sites=siteRepository.findAll();
        model.addAttribute("listSites",sites);
		     
		     List<Service> services=serviceRepository.findAll();
        model.addAttribute("listServices",services);
	
		     List<Typeservice> typeservices=typeserviceRepository.findAll();
		     model.addAttribute("listServices",typeservices);
	     
		     List<Inventaire> inventaires=inventaireRepository.findAll();
		     model.addAttribute("listInventaires",inventaires);
	     

		     return "inventairelist";
		     
	}


/*	
	  @RequestMapping(value = "/inventairelist", method = RequestMethod.GET)
	    public @ResponseBody
	    List<Inventaire> greeting() {
	        Inventaire produits = new Inventaire();
	        Inventaire sites = new Inventaire();
	        List<Inventaire> list = new ArrayList<>();
	        list.add(produits);
	        list.add(sites);
	        return list;
	    }*/
	
	
	   


         @RequestMapping(value="/403")
            public String accessDeniedPage(){
	        return "403";
                }

            @RequestMapping(value="/auth")
           public String auth(){
	          return "auth";
                     }

           /* @RequestMapping(value="/logout",method=RequestMethod.POST)
            public String logout(){
 	          return "logout";
                      }*/
           

                @RequestMapping(value="/")
               public String home(){
	            return "redirect:/inventairelist";


}
                }
