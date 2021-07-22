package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.CrudStudent;
import projetbymalek.MaanageEtudiantForm;

public class EvenUpdateEtd implements ActionListener {
	private MaanageEtudiantForm ms;
	
	public EvenUpdateEtd (MaanageEtudiantForm ms)
	{
		super();
		this.ms=ms;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String prenom=ms.getTextFieldPrenom().getText();
		String nom=ms.getTextFieldNom().getText(); 
		String sexe=ms.getTextFieldSExe().getText();
		String age=ms.getTextFieldAge().getText(); 
		String telnum=ms.getTextFieldNumTel().getText(); 
		String adresse=ms.getTextAreaAdrss().getText(); 
		int id=Integer.parseInt(ms.getcomboBox().getSelectedItem().toString());
		CrudStudent cs=new CrudStudent();
		cs.Updatestudent(prenom, nom, sexe, age, telnum, adresse, id);
		 ms.getCm().loadData(cs.getAllStudents());
		
	}

}
