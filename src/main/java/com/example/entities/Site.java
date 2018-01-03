package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.Table;
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
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
//@Table(name="site",uniqueConstraints = {@UniqueConstraint(columnNames="name")})


public class Site implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long refsite;
	
	//@Column(name="nomsociete")
	private String nomsociete;
	private String codesite;
	private String nomsite;
	private String prenomsite;
	private Long telprofessionnelsite;
    private Long telpersonnelsite;
	private String adressesite;
	private String villesite;
	private String emailsite;
	private String sitevisavis;
	private String longittudesite;
	private String lattitudesite;
	private String adressemanagementsite;
    private String type;
    private String libelle;
    private String referencequipement;

     
	  @JoinColumn(name = "refProduit")
	  @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  @JsonIgnore
      private Produit produit;
	  
	  @JoinColumn(name = "refEquipement")
	  @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
      private Equipement equipement;
	  
	  @JoinColumn(name = "refLiaison")
	  @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  private Equipement liaison;
	  @OneToMany(fetch = FetchType.LAZY,mappedBy="site")
		private List<Service> listServices=new ArrayList<Service>();
	public Long getRefsite() {
		return refsite;
	}
	public void setRefsite(Long refsite) {
		this.refsite = refsite;
	}
	public String getNomsociete() {
		return nomsociete;
	}
	public void setNomsociete(String nomsociete) {
		this.nomsociete = nomsociete;
	}
	public String getCodesite() {
		return codesite;
	}
	public void setCodesite(String codesite) {
		this.codesite = codesite;
	}
	public String getNomsite() {
		return nomsite;
	}
	public void setNomsite(String nomsite) {
		this.nomsite = nomsite;
	}
	public String getPrenomsite() {
		return prenomsite;
	}
	public void setPrenomsite(String prenomsite) {
		this.prenomsite = prenomsite;
	}
	public Long getTelprofessionnelsite() {
		return telprofessionnelsite;
	}
	public void setTelprofessionnelsite(Long telprofessionnelsite) {
		this.telprofessionnelsite = telprofessionnelsite;
	}
	public Long getTelpersonnelsite() {
		return telpersonnelsite;
	}
	public void setTelpersonnelsite(Long telpersonnelsite) {
		this.telpersonnelsite = telpersonnelsite;
	}
	public String getAdressesite() {
		return adressesite;
	}
	public void setAdressesite(String adressesite) {
		this.adressesite = adressesite;
	}
	public String getVillesite() {
		return villesite;
	}
	public void setVillesite(String villesite) {
		this.villesite = villesite;
	}
	public String getEmailsite() {
		return emailsite;
	}
	public void setEmailsite(String emailsite) {
		this.emailsite = emailsite;
	}
	public String getSitevisavis() {
		return sitevisavis;
	}
	public void setSitevisavis(String sitevisavis) {
		this.sitevisavis = sitevisavis;
	}
	public String getLongittudesite() {
		return longittudesite;
	}
	public void setLongittudesite(String longittudesite) {
		this.longittudesite = longittudesite;
	}
	public String getLattitudesite() {
		return lattitudesite;
	}
	public void setLattitudesite(String lattitudesite) {
		this.lattitudesite = lattitudesite;
	}
	public String getAdressemanagementsite() {
		return adressemanagementsite;
	}
	public void setAdressemanagementsite(String adressemanagementsite) {
		this.adressemanagementsite = adressemanagementsite;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Equipement getEquipement() {
		return equipement;
	}
	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}
	public Equipement getLiaison() {
		return liaison;
	}
	public void setLiaison(Equipement liaison) {
		this.liaison = liaison;
	}
	public List<Service> getListServices() {
		return listServices;
	}
	public void setListServices(List<Service> listServices) {
		this.listServices = listServices;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Site(Long refsite, String nomsociete, String codesite, String nomsite, String prenomsite,
			Long telprofessionnelsite, Long telpersonnelsite, String adressesite, String villesite, String emailsite,
			String sitevisavis, String longittudesite, String lattitudesite, String adressemanagementsite, String type,
			String libelle, String referencequipement, Produit produit, Equipement equipement, Equipement liaison,
			List<Service> listServices) {
		super();
		this.refsite = refsite;
		this.nomsociete = nomsociete;
		this.codesite = codesite;
		this.nomsite = nomsite;
		this.prenomsite = prenomsite;
		this.telprofessionnelsite = telprofessionnelsite;
		this.telpersonnelsite = telpersonnelsite;
		this.adressesite = adressesite;
		this.villesite = villesite;
		this.emailsite = emailsite;
		this.sitevisavis = sitevisavis;
		this.longittudesite = longittudesite;
		this.lattitudesite = lattitudesite;
		this.adressemanagementsite = adressemanagementsite;
		this.type = type;
		this.libelle = libelle;
		this.referencequipement = referencequipement;
		this.produit = produit;
		this.equipement = equipement;
		this.liaison = liaison;
		this.listServices = listServices;
	}
	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}
	



}