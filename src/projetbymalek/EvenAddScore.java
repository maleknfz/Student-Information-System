package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import dao.CrudCouseAndScores;
import dao.CrudStudent;
//import metier.score;
import metier.*;
import projetbymalek.MainForm;
import projetbymalek.addScoreForm;

public class EvenAddScore implements ActionListener {
	private addScoreForm sf;
	private MainForm mf;
	private LoginFormAction lfa;
	
	public EvenAddScore(addScoreForm sf) {
		super();
		this.sf = sf;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bclique=(JButton) e.getSource();
		if (bclique==sf.getAjouterNoteButton())
		{
		CrudCouseAndScores cs=new CrudCouseAndScores();
		  score s;
		
		int etdID=Integer.parseInt(sf.getTextFieldETDID().getText());
		int coursID=cs.getIDCourse(sf.getComboBoxNomCours().getSelectedItem().toString());
		//System.out.print(coursID);
		
		
		String etdScore=sf.getTextFieldNote().getText();
		String description=sf.getTextFieldDescription().getText();
		s=new score(etdID,coursID,etdScore,description);
		cs.AddScore(s);
		
		}
		else if (bclique==sf.getRetourNoteButton())
		{
			mf=new MainForm();
			mf.setVisible(true);
			sf.dispose();
			mf.getLabdelAdminName().setText(lfa.getAdmin());
			
		}
		
		
		
		
		
		
		
	}

}
