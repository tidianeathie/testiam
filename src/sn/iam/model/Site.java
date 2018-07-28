package sn.iam.model;

import java.util.ArrayList;

public class Site {
	private int code;
	private String nom;
	private ArrayList<Salle> salle;
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
	public ArrayList<Salle> getSalle() {
		return salle;
	}
	public void setSalle(ArrayList<Salle> salle) {
		this.salle = salle;
	}
	public Site(int code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}
	public Site() {
		
	}
	@Override
	public String toString() {
		return "Site [code=" + code + ", nom=" + nom + "]";
	}
	
	
}
