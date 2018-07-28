package sn.iam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sn.iam.bd.ConnexionBD;
import sn.iam.model.Domaine;
import sn.iam.model.Filiere;
import sn.iam.model.Site;

public class IFiliereImpl implements IFiliere {
	private Connection cnx;
	public IFiliereImpl() {
		cnx = ConnexionBD.getConnection();
	}
	@Override
	public void addFiliere(Filiere filiere) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Filiere findFiliereByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Filiere> findAll() {
		List<Filiere> filieres = new ArrayList<Filiere>();
		try 
		{
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM filiere");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Filiere filiere = new Filiere();
				filiere.setCode(rs.getInt("code"));
				filiere.setNom(rs.getString("nom"));
				filiere.setDomaine(new Domaine(rs.getInt("code_domaine"),"INFORMATIQUE"));
				filieres.add(filiere);
			}
		} catch (SQLException e) {
			System.out.println("Desolé, erreur SQL : "+e.getMessage());
		}
		return filieres;
	}
	
	@Override
	public Filiere getFiliere(int code) {
		Filiere filiere = null;
		try 
		{
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM filiere where code=?");
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				filiere = new Filiere();
				filiere.setCode(rs.getInt("code"));
				filiere.setNom(rs.getString("nom"));
				filiere.setDomaine(new Domaine(rs.getInt("Domaine_code"),"INFORMATIQUE"));
			}
		} catch (SQLException e) {
			System.out.println("Desolé, erreur SQL : "+e.getMessage());
		}
		return filiere;
	}

	
}
