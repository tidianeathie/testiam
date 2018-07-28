package sn.iam.service;

import java.util.List;

import sn.iam.model.Classe;

public interface IClasse {

	public void addClasse(Classe c);
	public List<Classe> listClasses();
	public List<Classe> classesParMC(String mc);
	public Classe getClasse(int code);
	public void updateClasse(Classe c);
	public void deleteClasse(int code);
	public Classe findClassByName(String nom);
}
