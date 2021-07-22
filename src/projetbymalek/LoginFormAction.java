package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import projetbymalek.MainForm;
import projetbymalek.LoginForm;
import dao.SingletonConnection;
// By AbdelMalek Nefzi BIS 2 :p 
public class LoginFormAction implements ActionListener {
	private Connection cn;
	private LoginForm l;
	private SingletonConnection c;
	private MainForm mf;
	public static String Admin;
	//private JButton bclique;
	public LoginFormAction(LoginForm l)
	{
		super();
		this.l=l;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bclique=(JButton) e.getSource();
		
		Connection con=c.getConnexion();
		PreparedStatement ps;
		
		
		
		if (bclique==l.getBtnNewButton())
		{
			l.dispose();
		}
		else 
		{
			if (l.getPasswordField().getText().equals("")||l.getTextFieldUser().getText().equals(""))
			{
				JOptionPane.showMessageDialog(l, "Please Check Your Details :p !Enter Ur User And Pass", "Erreur Login", JOptionPane.ERROR_MESSAGE);

			}
			else 
			{
				try {
					ps = con.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
					ps.setString(1,l.getTextFieldUser().getText());
					ps.setString(2,l.getPasswordField().getText());
					 ResultSet rs = ps.executeQuery();
					 
					 if (rs.next())
					 {
						 Admin=l.getTextFieldUser().getText();
						mf=new MainForm();
						mf.setVisible(true);
						l.dispose();
					 }
					 else{
		                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);
		                }
		                
				} catch (SQLException e1) {
					e1.printStackTrace();
					
				}
				
		}
			
			
		
		
		}
		
		
		
		
	}
	
	public static String getAdmin()
	{
		return Admin;
	}
	
	
	
	
	
	

}
