package sn.iam.model;

public class Equipement {
	private int code;
	private String marque;
	private String type;
	private Salle salle;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Equipement(int code, String marque, String type, Salle salle) {
		super();
		this.code = code;
		this.marque = marque;
		this.type = type;
		this.salle = salle;
	}
	public Equipement() {
		
	}
	
}
