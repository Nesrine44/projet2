//package com.example.web;
//
//
//
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.example.dao.PassationRepository;
//import com.example.dao.ProduitRepository;
//import com.example.entities.Passation;
//import com.example.entities.Produit;
//
//@Controller
//public class GestionclientController {
//	@Autowired
//
//
//private ProduitRepository produitRepository;
//	@RequestMapping(value="/gestionclient",method=RequestMethod.GET)
//	public String index(Model model,
//			@RequestParam(name="page",defaultValue="0")int p,
//			@RequestParam(name="size",defaultValue="7")int s,
//	@RequestParam(name="motCle",defaultValue="")String mc){
//
//			
//	Page<Produit> pageProduits=produitRepository.chercher("%"+mc+"%",new PageRequest(p, s));
//		model.addAttribute("listProduits",pageProduits.getContent());
//	     int[] pages=new int[pageProduits.getTotalPages()];
//	     model.addAttribute("pages",pages);
//	     model.addAttribute("motCle",mc);
//	    
//	     return "Gestionclient";
//	     
//	}
//	      }