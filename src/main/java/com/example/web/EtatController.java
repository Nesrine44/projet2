package com.example.web;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.EtatRepository;
import com.example.entities.Etat;



@Controller
public class EtatController {

	@Autowired
private EtatRepository etatRepository;
	@RequestMapping(value="/etat",method=RequestMethod.GET)
	public String etat(Model model,Long refEtat){
		
		model.addAttribute("Etat",new Etat());
		
		  List<Etat> Etat = new ArrayList<>();
	        model.addAttribute("Etat", Etat);


		List<Etat> etats=etatRepository.findAll();
				model.addAttribute("listEtats",etats);
		return "etat";
	}
	

}
		