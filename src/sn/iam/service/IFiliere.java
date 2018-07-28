package sn.iam.service;

import java.util.List;

import sn.iam.model.Filiere;
import sn.iam.model.Site;

public interface IFiliere {

	public void addFiliere(Filiere filiere);
	public Filiere findFiliereByName();
	public List<Filiere> findAll();
	Filiere getFiliere(int code);
}
