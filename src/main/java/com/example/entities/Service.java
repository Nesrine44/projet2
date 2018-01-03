package com.example.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity

public class Service implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long refservice;
	private Date dateMES;
	private String debit;
	private String adressewan;
	private String adresselan;
	private String nbrecanaux;
	private String plagesda;
	private String nbresda;
	private String numfacturation;
	private Date dateGo;
	private Date datereceptionCRM;
	private Date dateservicestime;
	private String codecas;

	private String vlanid;
	private String interco;
	private String loopbackvoix;
	private String nomtypeservice;
	private String codesite;
	
	@ManyToOne
	@JoinColumn(name="refIntegrateur")    /*jointure service*/
	private Integrateur integrateur;
	@ManyToOne
	@JoinColumn(name="refAgentsupport")    /*jointure service*/  /*cle etranger*/
	private Agentsupport agentsupport;
	@ManyToOne
	@JoinColumn(name="refsite")                
	private Site site;
	@OneToMany(fetch = FetchType.LAZY,mappedBy="service")
	private List<Typeservice> listTypeservices=new ArrayList<Typeservice>();
	public Long getRefservice() {
		return refservice;
	}
	public void setRefservice(Long refservice) {
		this.refservice = refservice;
	}
	public Date getDateMES() {
		return dateMES;
	}
	public void setDateMES(Date dateMES) {
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
	public Date getDateGo() {
		return dateGo;
	}
	public void setDateGo(Date dateGo) {
		this.dateGo = dateGo;
	}
	public Date getDatereceptionCRM() {
		return datereceptionCRM;
	}
	public void setDatereceptionCRM(Date datereceptionCRM) {
		this.datereceptionCRM = datereceptionCRM;
	}
	public String getCodecas() {
		return codecas;
	}
	public void setCodecas(String codecas) {
		this.codecas = codecas;
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
	public String getCodesite() {
		return codesite;
	}
	public void setCodesite(String codesite) {
		this.codesite = codesite;
	}
	public Integrateur getIntegrateur() {
		return integrateur;
	}
	public void setIntegrateur(Integrateur integrateur) {
		this.integrateur = integrateur;
	}
	public Agentsupport getAgentsupport() {
		return agentsupport;
	}
	public void setAgentsupport(Agentsupport agentsupport) {
		this.agentsupport = agentsupport;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	
	public Date getDateservicestime() {
		return dateservicestime;
	}
	public void setDateservicestime(Date dateservicestime) {
		this.dateservicestime = dateservicestime;
	}
	public List<Typeservice> getListTypeservices() {
		return listTypeservices;
	}
	public void setListTypeservices(List<Typeservice> listTypeservices) {
		this.listTypeservices = listTypeservices;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Service(Long refservice, Date dateMES, String debit, String adressewan, String adresselan, String nbrecanaux,
			String plagesda, String nbresda, String numfacturation, Date dateGo, Date datereceptionCRM,
			Date dateservicestime, String codecas,String vlanid, String interco, String loopbackvoix,
			String nomtypeservice, String codesite, Integrateur integrateur, Agentsupport agentsupport, Site site,
			List<Typeservice> listTypeservices) {
		super();
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
		this.dateservicestime = dateservicestime;
		this.codecas = codecas;
	
		this.vlanid = vlanid;
		this.interco = interco;
		this.loopbackvoix = loopbackvoix;
		this.nomtypeservice = nomtypeservice;
		this.codesite = codesite;
		this.integrateur = integrateur;
		this.agentsupport = agentsupport;
		this.site = site;
		this.listTypeservices = listTypeservices;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}