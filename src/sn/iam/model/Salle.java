package sn.iam.model;

import java.util.ArrayList;

public class Salle {
	private int code;
	private String nom;
	private int capacite;
	private int etage;
	private ArrayList<PlanningSalle> planningSalles;
	private ArrayList<Equipement> equipements;
	private Site site;
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
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public ArrayList<PlanningSalle> getPlanningSalles() {
		return planningSalles;
	}
	public void setPlanningSalles(ArrayList<PlanningSalle> planningSalles) {
		this.planningSalles = planningSalles;
	}
	public ArrayList<Equipement> getEquipements() {
		return equipements;
	}
	public void setEquipements(ArrayList<Equipement> equipements) {
		this.equipements = equipements;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public Salle(int code, String nom, int capacite, int etage, ArrayList<PlanningSalle> planningSalles,
			ArrayList<Equipement> equipements, Site site) {
		super();
		this.code = code;
		this.nom = nom;
		this.capacite = capacite;
		this.etage = etage;
		this.planningSalles = planningSalles;
		this.equipements = equipements;
		this.site = site;
	}
	public Salle() {
		
	}
	
}
