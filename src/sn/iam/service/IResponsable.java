package sn.iam.service;

import java.util.List;

import sn.iam.model.Responsable;

public interface IResponsable {

	public void addResponsable(Responsable responsable);
	public Responsable findResponsableByName();
	public List<Responsable> findAll();
	public Responsable getResponsable(int code);
}
