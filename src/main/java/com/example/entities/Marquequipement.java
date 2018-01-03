package com.example.entities;

import java.io.Serializable;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity

public class Marquequipement implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long refMarquequipement;
	private String nommarque;
	private String referencemarque;
	public Long getRefMarquequipement() {
		return refMarquequipement;
	}
	public void setRefMarquequipement(Long refMarquequipement) {
		this.refMarquequipement = refMarquequipement;
	}
	public String getNommarque() {
		return nommarque;
	}
	public void setNommarque(String nommarque) {
		this.nommarque = nommarque;
	}
	public String getReferencemarque() {
		return referencemarque;
	}
	public void setReferencemarque(String referencemarque) {
		this.referencemarque = referencemarque;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Marquequipement(Long refMarquequipement, String nommarque, String referencemarque) {
		super();
		this.refMarquequipement = refMarquequipement;
		this.nommarque = nommarque;
		this.referencemarque = referencemarque;
	}
	public Marquequipement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}