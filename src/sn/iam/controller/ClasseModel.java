package sn.iam.controller;

import java.util.ArrayList;
import java.util.List;

import sn.iam.model.Classe;

public class ClasseModel {
	private String motCle;
	private Classe classe= new Classe();
	private List<Classe> classes= new ArrayList<>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Classe> getClasses() {
		return classes;
	}
	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
}
