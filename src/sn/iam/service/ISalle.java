package sn.iam.service;

import sn.iam.model.Salle;

public interface ISalle {

	public void addSalle(Salle salle);
	public Salle findSalleByName();
}
