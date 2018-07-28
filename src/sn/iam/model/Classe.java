package sn.iam.model;

import java.util.ArrayList;

public class Classe {
	private int code;
	private String nom;
	private String anneeScolaire;
	private int nbEtudiant;
	private Filiere filiere;
	private Responsable responsable;
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
	public String getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	public int getNbEtudiant() {
		return nbEtudiant;
	}
	public void setNbEtudiant(int nbEtudiant) {
		this.nbEtudiant = nbEtudiant;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public Responsable getResponsable() {
		return responsable;
	}
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	
	public Classe(int code, String nom, String anneeScolaire, int nbEtudiant, Filiere filiere, Responsable responsable) {
		super();
		this.code = code;
		this.nom = nom;
		this.anneeScolaire = anneeScolaire;
		this.nbEtudiant = nbEtudiant;
		this.filiere = filiere;
		this.responsable = responsable;
	}
	public Classe() {
		
	}
	
	
}
