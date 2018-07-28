package sn.iam.service;

import sn.iam.model.Domaine;

public interface IDomaine {

	public void addDomaine(Domaine domaine);
	public Domaine findDomaineByName();
}
