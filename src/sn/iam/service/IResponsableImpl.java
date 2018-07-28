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
import sn.iam.model.Responsable;

public class IResponsableImpl implements IResponsable {

	private Connection cnx;
	public IResponsableImpl() {
		cnx = ConnexionBD.getConnection();
	}
	@Override
	public void addResponsable(Responsable responsable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Responsable findResponsableByName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Responsable> findAll() {
		// TODO Auto-generated method stub
		List<Responsable> responsables = new ArrayList<Responsable>();
		try 
		{
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM responsable");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Responsable responsable = new Responsable();
				responsable.setCode(rs.getInt("code"));
				responsable.setNom(rs.getString("nom"));
				responsable.setPrenom(rs.getString("prenom"));
				responsable.setLogin(rs.getString("login"));
				responsable.setPassword(rs.getString("password"));
				responsables.add(responsable);
			}
		} catch (SQLException e) {
			System.out.println("Desolé, erreur SQL : "+e.getMessage());
		}
		return responsables;
	}
	
	public Responsable getResponsable(int code) {
		// TODO Auto-generated method stub
		Responsable responsable = null;
		try 
		{
			PreparedStatement ps = cnx.prepareStatement("select * from responsable where code=?");
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				responsable = new Responsable();
				responsable.setCode(rs.getInt("code"));
				responsable.setNom(rs.getString("nom"));
				responsable.setPrenom(rs.getString("prenom"));
				responsable.setLogin(rs.getString("login"));
				responsable.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			System.out.println("Desolé, erreur SQL : "+e.getMessage());
		}
		return responsable;
	}

}
