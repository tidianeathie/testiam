package sn.iam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sn.iam.bd.ConnexionBD;
import sn.iam.model.Classe;
import sn.iam.model.Domaine;
import sn.iam.model.Filiere;
import sn.iam.model.Responsable;
import sn.iam.model.Site;

public class IClasseImpl implements IClasse{
	
	private Connection cnx;

	@Override
	public void addClasse(Classe c) {
		cnx = ConnexionBD.getConnection();
		try {
			PreparedStatement ps =cnx.prepareStatement("insert into classe(code,nom,annee_scolaire,nb_Etudiant,code_filiere,code_responsable) values (?,?,?,?,?,?)");
			ps.setInt(1, c.getCode());
			ps.setString(2, c.getNom());
			ps.setString(3, c.getAnneeScolaire());
			ps.setInt(4, c.getNbEtudiant());
			ps.setInt(5, c.getFiliere().getCode());
			ps.setInt(6, c.getResponsable().getCode());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Classe> listClasses() {
		List<Classe> classe= new ArrayList<Classe>();
		cnx = ConnexionBD.getConnection();
		try {
			PreparedStatement ps =cnx.prepareStatement("select * from classe");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Classe c= new Classe();
				c.setCode(rs.getInt("code"));
				c.setNom(rs.getString("nom"));
				c.setAnneeScolaire(rs.getString("annee_scolaire"));
				c.setNbEtudiant(rs.getInt("nb_Etudiant"));
				c.setFiliere(new Filiere(rs.getInt("code"),"Informatique",new Domaine()));
				c.setResponsable(new Responsable(rs.getInt("code"),"Camara","","",""));
				classe.add(c);
			}
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Mon Erreur :"+e.getMessage());
		}

		return classe;
	}

	@Override
	public List<Classe> classesParMC(String mc) {
		List<Classe> classe= new ArrayList<Classe>();
		cnx = ConnexionBD.getConnection();
		try {
			PreparedStatement ps =cnx.prepareStatement("select * from classe where code like ?");
			ps.setString(1, "%"+mc+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Classe c= new Classe();
				c.setCode(rs.getInt("code"));
				c.setNom(rs.getString("nom"));
				c.setAnneeScolaire(rs.getString("annee_scolaire"));
				c.setNbEtudiant(rs.getInt("nb_Etudiant"));
				c.setFiliere(new Filiere(rs.getInt("code"),"Informatique",new Domaine()));
				c.setResponsable(new Responsable(rs.getInt("code"),"Camara","","",""));
				classe.add(c);
			}
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return classe;
	}

	@Override
	public Classe getClasse(int code) {
		Classe c=null;
		cnx = ConnexionBD.getConnection();
		try {
			PreparedStatement ps =cnx.prepareStatement("select * from classe where code=?");
			ps.setInt(1, code);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				c=new Classe();
				c.setCode(rs.getInt("code"));
				c.setNom(rs.getString("nom"));
				c.setAnneeScolaire(rs.getString("annee_scolaire"));
				c.setNbEtudiant(rs.getInt("nb_Etudiant"));
				c.setFiliere(new Filiere(rs.getInt("code"),"Informatique",new Domaine()));
				c.setResponsable(new Responsable(rs.getInt("code"),"Camara","","",""));
			}
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(c==null) throw new RuntimeException("Classe"+code+ "introuvable");
		return c;
	}

	@Override
	public void updateClasse(Classe c) {
		cnx = ConnexionBD.getConnection();
		try {
			PreparedStatement ps =cnx.prepareStatement("update classe set nom=?, annee_scolaire=? , nb_Etudiant=?, code_filiere=?, code_responsable where code=?");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getAnneeScolaire());
			ps.setInt(3, c.getNbEtudiant());
			ps.setInt(4, c.getCode());
			ps.setInt(5, c.getFiliere().getCode());
			ps.setInt(6, c.getResponsable().getCode());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public void deleteClasse(int code) {
		cnx = ConnexionBD.getConnection();
		try {
			PreparedStatement ps =cnx.prepareStatement("delete from classe where code=?");
			ps.setInt(1, code);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

	@Override
	public Classe findClassByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Site> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
