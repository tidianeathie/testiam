package sn.iam.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {
	static String driverName="com.mysql.jdbc.Driver";
	static String urlName="jdbc:mysql://localhost:3306/bd_salle";
	static String userName="root";
	static String password="";
	static Connection connection=null;
	
	public static Connection getConnection()
	{
		try {
			Class.forName(driverName);
			System.out.println("Classe driver chargé avec Succéss");
			connection=DriverManager.getConnection(urlName, userName, password);
			System.out.println("Connecté avec Succèss");
		}
		catch (SQLException e) {
			System.out.println("Echec de Connexion : "+e.getMessage());
		}
		catch (ClassNotFoundException e) {
			System.out.println("Echec de Chargement du driver : "+e.getMessage());
		}
		
		return connection;
	}
}
