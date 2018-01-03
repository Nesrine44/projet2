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
import javax.persistence.OneToMany;




@Entity


public class Liaison implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	

	
	private Long refLiaison;
	private String type;
	public Long getRefLiaison() {
		return refLiaison;
	}
	public void setRefLiaison(Long refLiaison) {
		this.refLiaison = refLiaison;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Liaison(Long refLiaison, String type) {
		super();
		this.refLiaison = refLiaison;
		this.type = type;
	}
	public Liaison() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}