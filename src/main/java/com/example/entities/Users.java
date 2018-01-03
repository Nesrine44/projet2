package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;






@Entity
@Table(name="Users")
public class Users implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private String username;
	private String nom;
	private String prenom;
	private Long tel;
	private String email;
	private String password;
	private boolean actif;
	@ManyToMany
	@JoinTable(name="USERS_ROLES")
	private Collection<Role> roles;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Users(String username, String nom, String prenom, Long tel, String email, String password, boolean actif,
			Collection<Role> roles) {
		super();
		this.username = username;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.password = password;
		this.actif = actif;
		this.roles = roles;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
