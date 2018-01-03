package com.example.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Table;




@Entity
@Table(appliesTo="produit")
public class Produit implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	   private Long refProduit;
	   //@Column(name="nomsociete")
	   private String nomsociete;
	private String nomclient;
	private String prenomclient;
	@OneToMany(fetch = FetchType.LAZY,mappedBy="produit")
	private List<Site> listSites=new ArrayList<Site>();
	
	private Long telprofessionnel;
    private Long telpersonnel;
	private Long fax;
	private String adresse;
	private String ville;
	private String email;
	private Long nombresite;
	private String cgc;
	private String av;
	private Date date;
	private String agent;
	public Long getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(Long refProduit) {
		this.refProduit = refProduit;
	}
	public String getNomsociete() {
		return nomsociete;
	}
	public void setNomsociete(String nomsociete) {
		this.nomsociete = nomsociete;
	}
	public String getNomclient() {
		return nomclient;
	}
	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}
	public String getPrenomclient() {
		return prenomclient;
	}
	public void setPrenomclient(String prenomclient) {
		this.prenomclient = prenomclient;
	}
	public List<Site> getListSites() {
		return listSites;
	}
	public void setListSites(List<Site> listSites) {
		this.listSites = listSites;
	}
	public Long getTelprofessionnel() {
		return telprofessionnel;
	}
	public void setTelprofessionnel(Long telprofessionnel) {
		this.telprofessionnel = telprofessionnel;
	}
	public Long getTelpersonnel() {
		return telpersonnel;
	}
	public void setTelpersonnel(Long telpersonnel) {
		this.telpersonnel = telpersonnel;
	}
	public Long getFax() {
		return fax;
	}
	public void setFax(Long fax) {
		this.fax = fax;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getNombresite() {
		return nombresite;
	}
	public void setNombresite(Long nombresite) {
		this.nombresite = nombresite;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	public String getAv() {
		return av;
	}
	public void setAv(String av) {
		this.av = av;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Produit(Long refProduit, String nomsociete, String nomclient, String prenomclient, List<Site> listSites,
			Long telprofessionnel, Long telpersonnel, Long fax, String adresse, String ville, String email,
			Long nombresite, String cgc, String av, Date date, String agent) {
		super();
		this.refProduit = refProduit;
		this.nomsociete = nomsociete;
		this.nomclient = nomclient;
		this.prenomclient = prenomclient;
		this.listSites = listSites;
		this.telprofessionnel = telprofessionnel;
		this.telpersonnel = telpersonnel;
		this.fax = fax;
		this.adresse = adresse;
		this.ville = ville;
		this.email = email;
		this.nombresite = nombresite;
		this.cgc = cgc;
		this.av = av;
		this.date = date;
		this.agent = agent;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
		}