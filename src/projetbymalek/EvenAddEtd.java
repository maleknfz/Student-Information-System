package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import projetbymalek.addEtudiantForm;
import dao.CrudStudent;
import metier.student;
public class EvenAddEtd implements ActionListener {
	private  addEtudiantForm et;
	
	
	
	

	public EvenAddEtd(addEtudiantForm et) {
		super();
		this.et = et;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 
		  CrudStudent cs=new CrudStudent();
		  student s;
		  JButton bclique=(JButton) e.getSource();
			
			/*	if (et.getTextFieldPrenom().getText().equals("")||et.getTextFieldNom().getText().equals("")||et.getTextFieldAge().getText().equals("")||et.getTextAreaAdress().getText().equals("") )
				{
					JOptionPane.showMessageDialog(et, "Veuillez entrer tous les coordonnées", "Erreur Insertion", JOptionPane.ERROR_MESSAGE);

				}
				else { */
					//	public student(String prenom, String nom, String sexe, String age, String telnum, String adresse) {

				String prenom=et.getTextFieldPrenom().getText();
				String nom=et.getTextFieldNom().getText();
				String age=et.getTextFieldAge().getText();
				String num=et.getTextFieldNumPhone().getText();
				String addrs=et.getTextAreaAdress().getText();
				String sex = null;
				if (et.getFemmeRadioButton_1().isSelected())
				{
					 sex="Femme";
				}
				else if (et.getHommeRadioButton().isSelected())
				{
					sex="Homme";
				}
				//String prenom, String nom, String sexe, String age, String telnum, String adresse
				s=new student(prenom,nom,sex,age,num,addrs);
				cs.addStudent(s);
		
				

	}



}