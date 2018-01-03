package com.example.entities;

import java.io.Serializable;
import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;

@Entity

public class Typeservice implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long refTypeservice;
	private String nomtypeservice;
	@ManyToOne
	@JoinColumn(name="refservice")    /*jointure service*/
	private Service service;
	public Long getRefTypeservice() {
		return refTypeservice;
	}
	public void setRefTypeservice(Long refTypeservice) {
		this.refTypeservice = refTypeservice;
	}
	public String getNomtypeservice() {
		return nomtypeservice;
	}
	public void setNomtypeservice(String nomtypeservice) {
		this.nomtypeservice = nomtypeservice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Typeservice(Long refTypeservice, String nomtypeservice) {
		super();
		this.refTypeservice = refTypeservice;
		this.nomtypeservice = nomtypeservice;
	}
	public Typeservice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}