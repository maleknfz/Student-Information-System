package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.SingletonConnection;
import projetbymalek.MaanageEtudiantForm;

public class EvenRechercheByIDETD implements ActionListener {
	private MaanageEtudiantForm mf;
	private SingletonConnection c;
	public EvenRechercheByIDETD(MaanageEtudiantForm mf) {
		super();
		this.mf = mf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  Connection con = c.getConnexion();
	        PreparedStatement ps;
	        String cp=(String) mf.getcomboBox().getSelectedItem().toString();
	        if (cp.equals("Selection ID"))
			{
				 JOptionPane.showMessageDialog(mf, "secltionner un ID svp !!",
					      "Error", JOptionPane.ERROR_MESSAGE);
			}
	        try {
	            ps = con.prepareStatement("SELECT `prenom`, `nom`, `sexe`, `age`, `telnum`, `adresse` FROM `student` WHERE  id="+cp );
	            
	            ResultSet rs = ps.executeQuery();

	            
	            while(rs.next()){
	            	mf.getTextFieldPrenom().setText(rs.getString(1));
					mf.getTextFieldNom().setText(rs.getString(2));
					mf.getTextFieldSExe().setText(rs.getString(3));
					mf.getTextFieldAge().setText(rs.getString(4));
					mf.getTextFieldNumTel().setText(rs.getString(5));
					mf.getTextAreaAdrss().setText(rs.getString(6));
	            	
	            	
	            	
	               // model.addRow(row);
	            }
	            
	        } catch (SQLException ex) {
	            ex.getStackTrace();
	        }
	}

}
