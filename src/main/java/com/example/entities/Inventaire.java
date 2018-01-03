package com.example.entities;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Inventaire implements Serializable{
	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long refInventaire; 
	// class produit
	private Long refProduit;
	private String nomsociete;
	private String nomclient;
	private String prenomclient;
	private Long telprofessionnel;
    private Long telpersonnel;
	private Long fax;
	private String adresse;
	private String ville;
	private String email;
	private Long nombresite;
	private String cgc;
	private String av;

	//class site

	private Long refsite;
	private String codesite;
	private String nomsite;
	private String prenomsite;
	private Long telprofessionnelsite;
    private Long telpersonnelsite;
	private Long adressesite;
	private Long villesite;
	private String emailsite;
	private String sitevisavis;
	private String longittudesite;
	private String lattitudesite;
	private String adressemanagementsite;
    private String type;
    
  // class service
		private Long refservice;
		private String dateMES;
		private String debit;
		private String adressewan;
		private String adresselan;
		private String nbrecanaux;
		private String plagesda;
		private String nbresda;
		private String numfacturation;
		private String dateGo;
		private String datereceptionCRM;
		private String codecas;
		private String messtime;
		private String vlanid;
		private String interco;
		private String loopbackvoix;
		private String nomtypeservice;
		public Long getRefInventaire() {
			return refInventaire;
		}
		public void setRefInventaire(Long refInventaire) {
			this.refInventaire = refInventaire;
		}
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
		public Long getRefsite() {
			return refsite;
		}
		public void setRefsite(Long refsite) {
			this.refsite = refsite;
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
		public Long getAdressesite() {
			return adressesite;
		}
		public void setAdressesite(Long adressesite) {
			this.adressesite = adressesite;
		}
		public Long getVillesite() {
			return villesite;
		}
		public void setVillesite(Long villesite) {
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
		public Long getRefservice() {
			return refservice;
		}
		public void setRefservice(Long refservice) {
			this.refservice = refservice;
		}
		public String getDateMES() {
			return dateMES;
		}
		public void setDateMES(String dateMES) {
			this.dateMES = dateMES;
		}
		public String getDebit() {
			return debit;
		}
		public void setDebit(String debit) {
			this.debit = debit;
		}
		public String getAdressewan() {
			return adressewan;
		}
		public void setAdressewan(String adressewan) {
			this.adressewan = adressewan;
		}
		public String getAdresselan() {
			return adresselan;
		}
		public void setAdresselan(String adresselan) {
			this.adresselan = adresselan;
		}
		public String getNbrecanaux() {
			return nbrecanaux;
		}
		public void setNbrecanaux(String nbrecanaux) {
			this.nbrecanaux = nbrecanaux;
		}
		public String getPlagesda() {
			return plagesda;
		}
		public void setPlagesda(String plagesda) {
			this.plagesda = plagesda;
		}
		public String getNbresda() {
			return nbresda;
		}
		public void setNbresda(String nbresda) {
			this.nbresda = nbresda;
		}
		public String getNumfacturation() {
			return numfacturation;
		}
		public void setNumfacturation(String numfacturation) {
			this.numfacturation = numfacturation;
		}
		public String getDateGo() {
			return dateGo;
		}
		public void setDateGo(String dateGo) {
			this.dateGo = dateGo;
		}
		public String getDatereceptionCRM() {
			return datereceptionCRM;
		}
		public void setDatereceptionCRM(String datereceptionCRM) {
			this.datereceptionCRM = datereceptionCRM;
		}
		public String getCodecas() {
			return codecas;
		}
		public void setCodecas(String codecas) {
			this.codecas = codecas;
		}
		public String getMesstime() {
			return messtime;
		}
		public void setMesstime(String messtime) {
			this.messtime = messtime;
		}
		public String getVlanid() {
			return vlanid;
		}
		public void setVlanid(String vlanid) {
			this.vlanid = vlanid;
		}
		public String getInterco() {
			return interco;
		}
		public void setInterco(String interco) {
			this.interco = interco;
		}
		public String getLoopbackvoix() {
			return loopbackvoix;
		}
		public void setLoopbackvoix(String loopbackvoix) {
			this.loopbackvoix = loopbackvoix;
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
		
		
		
		
		
		public Inventaire(Long refInventaire, Long refProduit, String nomsociete, String nomclient, String prenomclient,
				Long telprofessionnel, Long telpersonnel, Long fax, String adresse, String ville, String email,
				Long nombresite, String cgc, String av, Long refsite, String codesite, String nomsite,
				String prenomsite, Long telprofessionnelsite, Long telpersonnelsite, Long adressesite, Long villesite,
				String emailsite, String sitevisavis, String longittudesite, String lattitudesite,
				String adressemanagementsite, String type, Long refservice, String dateMES, String debit,
				String adressewan, String adresselan, String nbrecanaux, String plagesda, String nbresda,
				String numfacturation, String dateGo, String datereceptionCRM, String codecas, String messtime,
				String vlanid, String interco, String loopbackvoix, String nomtypeservice) {
			super();
			this.refInventaire = refInventaire;
			this.refProduit = refProduit;
			this.nomsociete = nomsociete;
			this.nomclient = nomclient;
			this.prenomclient = prenomclient;
			this.telprofessionnel = telprofessionnel;
			this.telpersonnel = telpersonnel;
			this.fax = fax;
			this.adresse = adresse;
			this.ville = ville;
			this.email = email;
			this.nombresite = nombresite;
			this.cgc = cgc;
			this.av = av;
			this.refsite = refsite;
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
			this.refservice = refservice;
			this.dateMES = dateMES;
			this.debit = debit;
			this.adressewan = adressewan;
			this.adresselan = adresselan;
			this.nbrecanaux = nbrecanaux;
			this.plagesda = plagesda;
			this.nbresda = nbresda;
			this.numfacturation = numfacturation;
			this.dateGo = dateGo;
			this.datereceptionCRM = datereceptionCRM;
			this.codecas = codecas;
			this.messtime = messtime;
			this.vlanid = vlanid;
			this.interco = interco;
			this.loopbackvoix = loopbackvoix;
			this.nomtypeservice = nomtypeservice;
		}
		public Inventaire() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}
