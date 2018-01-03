package com.example.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity


public class Etat implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	

	private String etat;

	@ManyToOne
	@JoinColumn(name="refPassation")
	private Passation passation;

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Passation getPassation() {
		return passation;
	}

	public void setPassation(Passation passation) {
		this.passation = passation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Etat(String etat, Passation passation) {
		super();
		this.etat = etat;
		this.passation = passation;
	}

	public Etat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}