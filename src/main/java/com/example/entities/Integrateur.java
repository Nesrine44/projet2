package com.example.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Integrateur implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long refIntegrateur;
	private String nominteg;
	private String contact;
	private String email;
	private Long telephone;
	public Long getRefIntegrateur() {
		return refIntegrateur;
	}
	public void setRefIntegrateur(Long refIntegrateur) {
		this.refIntegrateur = refIntegrateur;
	}
	public String getNominteg() {
		return nominteg;
	}
	public void setNominteg(String nominteg) {
		this.nominteg = nominteg;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integrateur(Long refIntegrateur, String nominteg, String contact, String email, Long telephone) {
		super();
		this.refIntegrateur = refIntegrateur;
		this.nominteg = nominteg;
		this.contact = contact;
		this.email = email;
		this.telephone = telephone;
	}
	public Integrateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}