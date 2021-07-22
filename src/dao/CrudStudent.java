package dao;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

import metier.*;
import projetbymalek.MaanageEtudiantForm;

public class CrudStudent implements Icrude {
	
	@Override
	

		/*
		 * 
		 * 		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO `score`(`student_id`, `course_id`, `student_score`, `description`) VALUES (?,?,?,?)");
			ps.setInt(1,c.getEtdID());
			ps.setInt(2,c.getCoursID());
			ps.setString(3,c.getEtdScore());
			ps.setString(4,c.getDescription());
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "Insertion effectuée avec succès");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		 */
		public void addStudent(student e) {
			// TODO Auto-generated method stub
			Connection con=SingletonConnection.getConnexion();
			try {
				//	public student(String prenom, String nom, String sexe, String age, String telnum, String adresse) {

                PreparedStatement ps = con.prepareStatement("INSERT INTO `student`( `prenom`, `nom`, `sexe`, `age`, `telnum`, `adresse`) VALUES (?,?,?,?,?,?)");
				//ps.setInt(1,c.getIdCat());
				ps.setString(1,e.getPrenom());
				ps.setString(2,e.getNom());
				ps.setString(3,e.getSexe());
				ps.setString(4,e.getAge());
				ps.setString(5,e.getTelnum());
				ps.setString(6,e.getAdresse());
				ps.executeUpdate();
				ps.close();
				JOptionPane.showMessageDialog(null,"Insertion effectuée avec succès");
                
				//ps.close();
				
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null,ex.getMessage());
			}
		}

	@Override
	public void DelStudent(int id) {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		PreparedStatement ps;
		 int YesOrNo = JOptionPane.showConfirmDialog(null, "veulent vraiment supprimer l'élève et son note aussi?!","Supprimer Etudiant",JOptionPane.OK_CANCEL_OPTION,0);
         
         if(YesOrNo == JOptionPane.OK_OPTION)
         {
            try {
             ps = con.prepareStatement("DELETE FROM `student` WHERE `id` = ?");
             ps.setInt(1,id);
             if(ps.executeUpdate() > 0){
                 JOptionPane.showMessageDialog(null, "Supprimation effectuée avec succès");
             }
             
         } catch (SQLException ex) {
        	 JOptionPane.showMessageDialog(null,ex.getMessage());
         } 
		
	}
	}
	@Override
	public void Updatestudent(String prenom, String nom, String sexe, String age, String telnum, String adresse, int id) {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		try {
			//	public student(String prenom, String nom, String sexe, String age, String telnum, String adresse) {
			//UPDATE `std` SET `id`=[value-1],`prenom`=[value-2],`nom`=[value-3],`sexe`=[value-4],`age`=[value-5],`telnum`=[value-6],`adresse`=[value-7] WHERE
            PreparedStatement ps = con.prepareStatement("UPDATE `student` SET `prenom`= ?,`nom`= ?,`sexe`= ?,`age`= ?,`telnum`= ?,`adresse`= ? WHERE `id`= ?");
			//ps.setInt(1,c.getIdCat());
			ps.setString(1,prenom);
			ps.setString(2,nom);
			ps.setString(3,sexe);
			ps.setString(4,age);
			ps.setString(5,telnum);
			ps.setString(6,adresse);
			ps.setInt(7,id);
			ps.executeUpdate();
			if(ps.executeUpdate() > 0){
				JOptionPane.showMessageDialog(null,"Modification effectuée avec succès");
            }
			ps.close();
			
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
		
		
		
	}


	@Override
	public List<student> getAllStudents() {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		List<student> std=new ArrayList<student>();
		try {
			PreparedStatement ps=con.prepareStatement("SELECT `id`, `prenom`, `nom`, `sexe`, `age`, `telnum`, `adresse` FROM `student`");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				student s=new student();
				s.setId(rs.getInt(1));
				s.setPrenom(rs.getString(2));
				s.setNom(rs.getString(3));
				s.setSexe(rs.getString(4));
				s.setAge(rs.getString(5));
				s.setTelnum(rs.getString(6));
				s.setAdresse(rs.getString(7));
			//	p.setQuantite(rs.getInt("QUANTITE"));
				std.add(s);
			}
					ps.close();	
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());	}
		
		return std;
		
		
	}
	
	
	 public List<student> getStudents() {
		// TODO Auto-generated method stub
			Connection con=SingletonConnection.getConnexion();
			List<student> std=new ArrayList<student>();
			try {
				PreparedStatement ps=con.prepareStatement("SELECT `id`, `prenom`, `nom` FROM `student`");
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					student st=new student();
					st.setId(rs.getInt(1));
					st.setPrenom(rs.getString(2));
					st.setNom(rs.getString(3));
				//	p.setQuantite(rs.getInt("QUANTITE"));
					std.add(st);
				}
						ps.close();	
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,e.getMessage());	}
			
			return std;
			
			
		}
	 
	 
		public List<Object> loadIds()
		 {
			Connection con=SingletonConnection.getConnexion();
		        PreparedStatement ps;
		        int i=0;
		        ArrayList<Object> ab=new ArrayList();
		        try {
		            ps = con.prepareStatement("SELECT * FROM `student`");
		            
		            ResultSet rs = ps.executeQuery();
		            while (rs.next()) 
	                { 
		            	Object o=new Object();
		            	
		            	o=rs.getInt(1);
		            	ab.add(o);
	                  // i++;
	                } 
		           
		        } catch (SQLException ex) {
		            ex.getStackTrace();
		  
		        }
		        return ab;
		 }

	}
	
	
	
	
