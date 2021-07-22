package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import dao.CrudCouseAndScores;
import projetbymalek.MainForm;
import projetbymalek.ManageScores;

public class EvenManageScore implements ActionListener {
	private ManageScores ms;
	private MainForm mf;
	public EvenManageScore(ManageScores ms) {
		super();
		this.ms = ms;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bclique=(JButton) e.getSource();
		
	if (bclique==ms.getModifierButton())
	{
		//public void updateScore(int idE,int idC,String note,String Description);
		CrudCouseAndScores cc=new CrudCouseAndScores();
		int idC=Integer.parseInt(ms.getTextFieldIDCours().getText());
		int idE=Integer.parseInt(ms.getTextFieldEtudianteID().getText());
		String note=ms.getTextFieldNote().getText();
		String Description=ms.getTextFieldDescription().getText();
		cc.updateScore(idE, idC, note, Description);
		ms.getCm().loadData(cc.getAllscores());
	}
	else if (bclique==ms.getSupprimerButton())
	{
		CrudCouseAndScores cc=new CrudCouseAndScores();
		int idC=Integer.parseInt(ms.getTextFieldIDCours().getText());
		int idE=Integer.parseInt(ms.getTextFieldEtudianteID().getText());
		cc.SuppScore(idE, idC);
		ms.getCm().loadData(cc.getAllscores());
		
	}
	else if (bclique==ms.getRetourButton())
	{
		
		mf=new MainForm();
		mf.setVisible(true);
		ms.dispose();
		
		
	}
		
		
		

	}

}
