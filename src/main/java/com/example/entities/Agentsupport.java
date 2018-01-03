package com.example.entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agentsupport implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long refAgentsupport;
	private String nomagentsupport;
	private String prenomagentsupport;
	private String emailagentsupport;
	private Long telagentsupport;
    private String profession;
	private String role;
	public Long getRefAgentsupport() {
		return refAgentsupport;
	}
	public void setRefAgentsupport(Long refAgentsupport) {
		this.refAgentsupport = refAgentsupport;
	}
	public String getNomagentsupport() {
		return nomagentsupport;
	}
	public void setNomagentsupport(String nomagentsupport) {
		this.nomagentsupport = nomagentsupport;
	}
	public String getPrenomagentsupport() {
		return prenomagentsupport;
	}
	public void setPrenomagentsupport(String prenomagentsupport) {
		this.prenomagentsupport = prenomagentsupport;
	}
	public String getEmailagentsupport() {
		return emailagentsupport;
	}
	public void setEmailagentsupport(String emailagentsupport) {
		this.emailagentsupport = emailagentsupport;
	}
	public Long getTelagentsupport() {
		return telagentsupport;
	}
	public void setTelagentsupport(Long telagentsupport) {
		this.telagentsupport = telagentsupport;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Agentsupport(Long refAgentsupport, String nomagentsupport, String prenomagentsupport,
			String emailagentsupport, Long telagentsupport, String profession, String role) {
		super();
		this.refAgentsupport = refAgentsupport;
		this.nomagentsupport = nomagentsupport;
		this.prenomagentsupport = prenomagentsupport;
		this.emailagentsupport = emailagentsupport;
		this.telagentsupport = telagentsupport;
		this.profession = profession;
		this.role = role;
	}
	public Agentsupport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}