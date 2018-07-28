package sn.iam.model;

import java.util.ArrayList;

public class Filiere {
	private int code;
	private String nom;
	private Domaine domaine;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Domaine getDomaine() {
		return domaine;
	}
	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	
	public Filiere(int code, String nom, Domaine domaine) {
		super();
		this.code = code;
		this.nom = nom;
		this.domaine = domaine;
	}
	public Filiere() {
		
	}
	
}
