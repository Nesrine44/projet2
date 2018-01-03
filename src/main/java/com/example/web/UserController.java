package com.example.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EquipementRepository;
import com.example.dao.LiaisonRepository;
import com.example.dao.ProduitRepository;
import com.example.dao.RoleRepository;
import com.example.dao.UserRepository;
import com.example.entities.Equipement;
import com.example.entities.Passation;
import com.example.entities.Produit;
import com.example.entities.Role;
import com.example.entities.Users;





@Controller
public class UserController {
	
	@Autowired(required = true)
	private RoleRepository roleRepository;
	@Autowired
	public UserController(RoleRepository roleRepository){
	this.roleRepository=roleRepository;
	
	}
	
	@Autowired
    private UserRepository userRepository;
	@RequestMapping(value="/utilisateur",method=RequestMethod.GET)
	public String utilisateur(Model model){
		
		 List<Role> role = new ArrayList<>();
	        model.addAttribute("role", role);
	        List<Users> users = new ArrayList<>();
	        model.addAttribute("users", users);
	        
		List<Role> roles=roleRepository.findAll();
	   	model.addAttribute("listRoles",roles);
	   	List<Users> users1=userRepository.findAll();
	   		   	model.addAttribute("listUsers",users1);
		
	    return "utilisateur";
	}		
	
	@RequestMapping(value="/formuser",method=RequestMethod.GET)
	public String formuser(Model model,Long refuser){
		 List<Role> role = new ArrayList<>();
	        model.addAttribute("role", role);
	        List<Users> users = new ArrayList<>();
	        model.addAttribute("users", users);
	        
		List<Role> roles=roleRepository.findAll();
	   	model.addAttribute("listRoles",roles);
	   	List<Users> users1=userRepository.findAll();
	   		   	model.addAttribute("listUsers",users1);
		
		return "Formuser";
	}

	 @RequestMapping(value="/save7",method=RequestMethod.POST)
	  public String save7(Model model,Users user){	
		  userRepository.save(user);
		  return  "redirect:/utilisateur";
	}
		
	@RequestMapping(value="/edit1",method=RequestMethod.GET)
	public String edit(Model model,Long refuser){
	       
		Users p=userRepository.findOne(refuser);
		model.addAttribute("User",p);
		
			//model.addAttribute("Produit",new Produit());
		return "Edit";
		}
			
		
	

    @RequestMapping(value="/delete1")
	public String delete1(){
		return "redirect:/utilisateur";
	}
    
    @RequestMapping(value="/save7")
   	public String save7(){
   		return "redirect:/utilisateur";
   	}
	  
		
		@RequestMapping(value="/delete1",method=RequestMethod.GET)
		public String delete1(Long refuser){
			userRepository.delete(refuser);
			return "redirect:/utilisateur";
			
		
}}

