package sn.iam.test;

import java.util.ArrayList;
import java.util.List;

import sn.iam.bd.ConnexionBD;
import sn.iam.model.Classe;
import sn.iam.model.Domaine;
import sn.iam.model.Filiere;
import sn.iam.model.PlanningSalle;
import sn.iam.model.Responsable;
import sn.iam.model.Site;
import sn.iam.service.IClasseImpl;
import sn.iam.service.IFiliereImpl;
import sn.iam.service.IResponsableImpl;
import sn.iam.service.ISiteImpl;

public class Testeur {

	public static void main(String[] args) {
		//ConnexionBD.getConnection();
		List<Filiere> filieres= new IFiliereImpl().findAll();
		List<Responsable> responsables= new IResponsableImpl().findAll();
		IClasseImpl metier = new IClasseImpl();
		IFiliereImpl metierFiliere = new IFiliereImpl();
		
		
		System.out.println("**************************************************************");
		for(Filiere s : filieres) {
			System.out.println("code "+s.getCode());
			System.out.println("domaine "+s.getDomaine().getCode());
		}
		System.out.println("**************************************************************");
		for(Responsable r : responsables) {
			System.out.println("code "+r.getCode());
			System.out.println("nom "+r.getNom());
		}
		System.out.println("**************************************************************");
		Filiere filiere = new Filiere(1,"BBA",new Domaine());
		Responsable responsable = new Responsable(2,"OUMANE","ndiaye","passer","passer");
		Classe classe = new Classe(0,"BBA","2017",23,filiere,responsable);
		try {
			//metier.addClasse(classe);
		} catch (Exception e) {
			System.out.println("echec insertion : "+e.getMessage());
		}
		
		System.out.println("**************************************************************");
		try {
			Classe c = new Classe(1,"BBA","2017",23,filiere,responsable);
			filiere.setNom("BIT");
			responsable.setNom("BAMBADJI");
			//metier.updateClasse(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("**************************************************************");
		try {
			int code = 1;
			//metier.deleteClasse(code);;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("**************************************************************");
		try {
			int code = 1;
			Classe c = metier.getClasse(code);
			System.out.println("code : "+c.getCode()+" nom classe :"+c.getNom()+" annee :"+c.getAnneeScolaire()+" filiere :"+c.getFiliere().getCode());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("*********************** fileire ***************************************");
		try {
			int code = 1;
			Filiere f = metierFiliere.getFiliere(code);
			System.out.println("code : "+f.getCode()+" nom classe :"+f.getNom());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
