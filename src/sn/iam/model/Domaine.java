package sn.iam.model;

import java.util.ArrayList;

public class Domaine {
	private int code;
	private String nom;
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
	
	public Domaine(int code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}
	public Domaine() {
		
	}
	
}
