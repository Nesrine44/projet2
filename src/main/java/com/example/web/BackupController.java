package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.BackupRepository;
import com.example.dao.UserRepository;
import com.example.entities.Backup;
import com.example.entities.Passation;
import com.example.entities.Produit;
import com.example.entities.Users;





@Controller
public class BackupController {
	@Autowired


private BackupRepository backupRepository;
	@RequestMapping(value="/backuplist",method=RequestMethod.GET)
	public String backuplist(Model model){
		List<Backup> backups=backupRepository.findAll();
		model.addAttribute("listBackups",backups);	
	    return "backuplist";
	}		
	
	@RequestMapping(value="/nouvellebackup",method=RequestMethod.GET)
	public String nouvellebackup(Model model,Long refBackup){
		Backup p=backupRepository.findOne(refBackup);
		model.addAttribute("Backup",p);
		return "backup";
	}

	 @RequestMapping(value="/save10",method=RequestMethod.POST)
	  public String save10(Model model,Backup backup){	
		 backupRepository.save(backup);
		  return "Confirmationbackup";
	}
		
	@RequestMapping(value="/editback",method=RequestMethod.GET)
	public String editback(Model model,Long refBackup){
	       
		Backup p=backupRepository.findOne(refBackup);
		model.addAttribute("Backup",p);
		
			//model.addAttribute("Produit",new Produit());
		return "Edit";
		}
			
		
	
		
		
		@RequestMapping(value="/deleteback",method=RequestMethod.GET)
		public String deleteback(Long refrefBackup){
			backupRepository.delete(refrefBackup);
			return "redirect:/index";
			
		
}}

