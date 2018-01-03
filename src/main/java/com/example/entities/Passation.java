package com.example.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity


public class Passation implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long refPassation;
	private String prenomclient;

	private String nomtypeservice;

	private String prenomsite;
	private String integrepar;
	private String validepar;
    private String etat;
	private String commentaire;
	private String corrige;
	
	@JsonFormat
	private Date datevalidation;
	@JsonFormat
    private Date dateretour;
	@JsonFormat
	private Date datepassation;
	@ManyToOne
	@JoinColumn(name="refAgentsupport")
	private Agentsupport agentsupport;
	@ManyToOne
	@JoinColumn(name="refservice")
	private Service service;
	public Long getRefPassation() {
		return refPassation;
	}
	public void setRefPassation(Long refPassation) {
		this.refPassation = refPassation;
	}
	public String getPrenomclient() {
		return prenomclient;
	}
	public void setPrenomclient(String prenomclient) {
		this.prenomclient = prenomclient;
	}
	public String getNomtypeservice() {
		return nomtypeservice;
	}
	public void setNomtypeservice(String nomtypeservice) {
		this.nomtypeservice = nomtypeservice;
	}
	public String getPrenomsite() {
		return prenomsite;
	}
	public void setPrenomsite(String prenomsite) {
		this.prenomsite = prenomsite;
	}
	public String getIntegrepar() {
		return integrepar;
	}
	public void setIntegrepar(String integrepar) {
		this.integrepar = integrepar;
	}
	public String getValidepar() {
		return validepar;
	}
	public void setValidepar(String validepar) {
		this.validepar = validepar;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getCorrige() {
		return corrige;
	}
	public void setCorrige(String corrige) {
		this.corrige = corrige;
	}
	public Date getDatevalidation() {
		return datevalidation;
	}
	public void setDatevalidation(Date datevalidation) {
		this.datevalidation = datevalidation;
	}
	public Date getDateretour() {
		return dateretour;
	}
	public void setDateretour(Date dateretour) {
		this.dateretour = dateretour;
	}
	public Date getDatepassation() {
		return datepassation;
	}
	public void setDatepassation(Date datepassation) {
		this.datepassation = datepassation;
	}
	public Agentsupport getAgentsupport() {
		return agentsupport;
	}
	public void setAgentsupport(Agentsupport agentsupport) {
		this.agentsupport = agentsupport;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Passation(Long refPassation, String prenomclient, String nomtypeservice, String prenomsite, String integrepar,
			String validepar, String etat, String commentaire, String corrige, Date datevalidation, Date dateretour,
			Date datepassation, Agentsupport agentsupport, Service service) {
		super();
		this.refPassation = refPassation;
		this.prenomclient = prenomclient;
		this.nomtypeservice = nomtypeservice;
		this.prenomsite = prenomsite;
		this.integrepar = integrepar;
		this.validepar = validepar;
		this.etat = etat;
		this.commentaire = commentaire;
		this.corrige = corrige;
		this.datevalidation = datevalidation;
		this.dateretour = dateretour;
		this.datepassation = datepassation;
		this.agentsupport = agentsupport;
		this.service = service;
	}
	public Passation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}