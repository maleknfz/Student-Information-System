package dao;

import java.sql.*;
import javax.swing.*;


public class SingletonConnection {
private static Connection connexion ;
static {
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/stdmgdb?serverTimezone=UTC","root","");
		//JOptionPane.showMessageDialog(null, "Conexion etablie avec success","connexion",JOptionPane.INFORMATION_MESSAGE);
	}
	catch (Exception e)
	{
		JOptionPane.showMessageDialog(null,e.getMessage(),"Erreur de Connexion",JOptionPane.ERROR_MESSAGE);	
	}
}
	
	public static Connection getConnexion()
	{
		return connexion;
	}
	
	
}
