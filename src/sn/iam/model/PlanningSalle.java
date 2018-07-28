package sn.iam.model;

import java.util.Date;

public class PlanningSalle {
	private int code;
	private String jour;
	private Date heureDebut;
	private Date heureFin;
	private Classe classe;
	private Salle salle;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public Date getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Date getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public PlanningSalle(int code, String jour, Date heureDebut, Date heureFin, Classe classe, Salle salle) {
		super();
		this.code = code;
		this.jour = jour;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.classe = classe;
		this.salle = salle;
	}
	public PlanningSalle() {
		
	}
	
}
