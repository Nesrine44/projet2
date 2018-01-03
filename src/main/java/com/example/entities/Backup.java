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

public class Backup implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	

	private Long refBackup;
	private String numtt;
	private String numtroisgquatreg;
	public Long getRefBackup() {
		return refBackup;
	}
	public void setRefBackup(Long refBackup) {
		this.refBackup = refBackup;
	}
	public String getNumtt() {
		return numtt;
	}
	public void setNumtt(String numtt) {
		this.numtt = numtt;
	}
	public String getNumtroisgquatreg() {
		return numtroisgquatreg;
	}
	public void setNumtroisgquatreg(String numtroisgquatreg) {
		this.numtroisgquatreg = numtroisgquatreg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Backup(Long refBackup, String numtt, String numtroisgquatreg) {
		super();
		this.refBackup = refBackup;
		this.numtt = numtt;
		this.numtroisgquatreg = numtroisgquatreg;
	}
	public Backup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	