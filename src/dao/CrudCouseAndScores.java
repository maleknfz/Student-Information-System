package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//import metier.course;
import metier.*;
import projetbymalek.addScoreForm;

public class CrudCouseAndScores implements Icrude2 {

	@Override
	public void AddCourse(course ce) {
		// TODO Auto-generated method stub
		Connection con = SingletonConnection.getConnexion();
		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO `course`(`label`, `hours_number`) VALUES (?,?)");
			ps.setString(1,ce.getLabel());
			ps.setInt(2,ce.getNb_heures());
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null, "Insertion effectuée avec succès");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
		

	}

	@Override
	public void SuppCourse(int id) {
		Connection con=SingletonConnection.getConnexion();
		try {
			PreparedStatement ps=con.prepareStatement("DELETE from course where id=?;");
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null,"Suppression effectuée avec succès");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,e.getMessage());
		}

	}

	@Override
	public void updateCoruse(int id, String label, int nb_heures) {
		
		
		Connection con=SingletonConnection.getConnexion();
		try {
			PreparedStatement ps=con.prepareStatement("UPDATE `course` SET `label`= ?,`hours_number`= ? WHERE `id`= ?");
			ps.setString(1, label);
			ps.setInt(2, nb_heures);
			ps.setInt(3, id);
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null,"Modification effectuée avec succès");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
	/*
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		List<Categorie> cats=new ArrayList<Categorie>();
		try {
			PreparedStatement ps=con.prepareStatement("Select ID_CAT,NOM_CAT from CATEGORIE;");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Categorie c=new Categorie();
				c.setIdCat(rs.getInt("ID_CAT"));
				c.setNomCat(rs.getString("NOM_CAT"));
				cats.add(c);
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return cats;
	}
	}
	
	*/
	@Override
	public List<course> getAllCourses() {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		List<course> cour=new ArrayList<course>();
		try {
			PreparedStatement ps=con.prepareStatement("SELECT `id`, `label`, `hours_number` FROM `course`");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				course p=new course();
				p.setId(rs.getInt(1));
				p.setLabel(rs.getString(2));
				p.setNb_heures(rs.getInt(3));
			//	p.setQuantite(rs.getInt("QUANTITE"));
				cour.add(p);
			}
					ps.close();	
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());	}
		
		return cour;
		
		
	}

	@Override
	public void AddScore(score c) {
		// TODO Auto-generated method stub
		Connection con = SingletonConnection.getConnexion();
		try {
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
		
	}

	@Override
	public void SuppScore(int idE,int idC) {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		try {
			PreparedStatement ps=con.prepareStatement("DELETE from score where student_id= ? AND course_id= ?;");
			ps.setInt(1, idE);
			ps.setInt(2, idC);
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null,"Suppression effectuée avec succès");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,e.getMessage());
		}

		
	}

	@Override
	public void updateScore(int idE,int idC,String note,String Description) {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		try {
			PreparedStatement ps=con.prepareStatement("UPDATE `score` SET `student_score`= ?,`description`= ? WHERE `student_id`= ? AND `course_id`= ?");
			ps.setString(1, note);
			ps.setString(2, Description);
			ps.setInt(3, idE);
			ps.setInt(4, idC);
			ps.executeUpdate();
			ps.close();
			JOptionPane.showMessageDialog(null,"Modification effectuée avec succès");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	@Override
	public List<score> getAllscores()  {
		// TODO Auto-generated method stub
		Connection con=SingletonConnection.getConnexion();
		List<score> note=new ArrayList<score>();
		try {
			PreparedStatement ps=con.prepareStatement("SELECT `student_id`, `course_id`, `student_score`, `description` FROM `score`");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				score s=new score();
				s.setEtdID(rs.getInt(1));
				s.setCoursID(rs.getInt(2));
				s.setEtdScore(rs.getString(3));
				s.setDescription(rs.getString(4));
			//	p.setQuantite(rs.getInt("QUANTITE"));
				note.add(s);
			}
					ps.close();	
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());	}
		
		return note;
		
		
	}
	 public void ShowAllScores(JTable table)
	    {
	        Connection con = SingletonConnection.getConnexion();
	        PreparedStatement ps;
	        try {
	            ps = con.prepareStatement("SELECT `student_id`, prenom, nom, label, student_score\n" +
	                                        "FROM `score`\n" +
	                                        "INNER JOIN student as stab on stab.id = `student_id`\n" +
	                                        "INNER JOIN course as ctab on ctab.id = `course_id`");
	            ResultSet rs = ps.executeQuery();
	            DefaultTableModel model = (DefaultTableModel)table.getModel();
	            
	            Object[] row;
	            
	            while(rs.next()){
	                row = new Object[5];
	                row[0] = rs.getInt(1);
	                row[1] = rs.getString(2);
	                row[2] = rs.getString(3);
	                row[3] = rs.getString(4);
	                row[4] = rs.getDouble(5);
	                model.addRow(row);
	            }
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	 
	 
	 private  addScoreForm cx;
	 
	 public CrudCouseAndScores() {} ;
	 public CrudCouseAndScores(addScoreForm cx) {
		 
		 
		 this.cx=cx;
		 
	 }
	 public void loadNomdeCours()
	 {
		 Connection con = SingletonConnection.getConnexion();
	        PreparedStatement ps;
	        //addScoreForm cx = null ;
	        try {
	            ps = con.prepareStatement("SELECT * FROM `course`");
	            
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) 
                { 
                   cx.getComboBoxNomCours().addItem(rs.getString(2)); 
                } 
	            
	        } catch (SQLException ex) {
	            ex.getMessage();
	        }

}
	 
	 
	 public  int getIDCourse (String NomCour)
	 {
		 
		 Connection con=SingletonConnection.getConnexion();
			int id = 0;
			try {
				PreparedStatement ps=con.prepareStatement("SELECT `id` FROM `course` WHERE `label`= ?");
				ps.setString(1, NomCour);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					///course p=new course();
					id=rs.getInt(1);					
							
					
				}
				
				ps.close();	
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,e.getMessage());	}
			
			return id;
			
		 
		 
	 }
	 
	 
	 
	 public void ShowBestScores(JTable table)
	    {
	        Connection con = SingletonConnection.getConnexion();
	        PreparedStatement ps;
	        try {
	            ps = con.prepareStatement("SELECT `student_id`, prenom, nom, label, student_score\n" +
	                                        "FROM `score`\n" +
	                                        "INNER JOIN student as stab on stab.id = `student_id`\n" +
	                                        "INNER JOIN course as ctab on ctab.id = `course_id` where student_score>15");
	            ResultSet rs = ps.executeQuery();
	            DefaultTableModel model = (DefaultTableModel)table.getModel();
	            
	            Object[] row;
	            
	            while(rs.next()){
	                row = new Object[5];
	                row[0] = rs.getInt(1);
	                row[1] = rs.getString(2);
	                row[2] = rs.getString(3);
	                row[3] = rs.getString(4);
	                row[4] = rs.getDouble(5);
	                model.addRow(row);
	            }
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	 
	 public void ShowBADScores(JTable table)
	    {
	        Connection con = SingletonConnection.getConnexion();
	        PreparedStatement ps;
	        try {
	            ps = con.prepareStatement("SELECT `student_id`, prenom, nom, label, student_score\n" +
	                                        "FROM `score`\n" +
	                                        "INNER JOIN student as stab on stab.id = `student_id`\n" +
	                                        "INNER JOIN course as ctab on ctab.id = `course_id` where student_score<10");
	            ResultSet rs = ps.executeQuery();
	            DefaultTableModel model = (DefaultTableModel)table.getModel();
	            
	            Object[] row;
	            
	            while(rs.next()){
	                row = new Object[5];
	                row[0] = rs.getInt(1);
	                row[1] = rs.getString(2);
	                row[2] = rs.getString(3);
	                row[3] = rs.getString(4);
	                row[4] = rs.getDouble(5);
	                model.addRow(row);
	            }
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
}
