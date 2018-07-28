package sn.iam.service;

import sn.iam.model.Equipement;

public interface IEquipement {

	public void addEquipement(Equipement equipement);
	public Equipement findEquipementByName();
}
