package com.example.entities;




import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity

public class Equipement implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)

	private Long refEquipement;
    private String libelle;
    private String referencequipement;
	public Long getRefEquipement() {
		return refEquipement;
	}
	public void setRefEquipement(Long refEquipement) {
		this.refEquipement = refEquipement;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getReferencequipement() {
		return referencequipement;
	}
	public void setReferencequipement(String referencequipement) {
		this.referencequipement = referencequipement;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Equipement(Long refEquipement, String libelle, String referencequipement) {
		super();
		this.refEquipement = refEquipement;
		this.libelle = libelle;
		this.referencequipement = referencequipement;
	}
	public Equipement() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	
}