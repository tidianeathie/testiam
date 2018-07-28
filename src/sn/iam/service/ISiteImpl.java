package sn.iam.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sn.iam.bd.ConnexionBD;
import sn.iam.model.Site;

public class ISiteImpl implements ISite{

	private Connection cnx;
	public ISiteImpl() {
		cnx = ConnexionBD.getConnection();
	}
	@Override
	public void addSite(Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Site findSiteByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Site> findAll() {
		List<Site> sites = new ArrayList<Site>();
		try 
		{
			PreparedStatement ps = cnx.prepareStatement("SELECT * FROM site");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				sites.add(new Site(rs.getInt("code"), rs.getString("nom")));
			}
		} catch (SQLException e) {
			System.out.println("Desolé, erreur SQL : "+e.getMessage());
		}
		return sites;
	}

}
