package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import projetbymalek.addEtudiantForm;
import projetbymalek.MainForm;
public class AEFAction implements ActionListener {
	private addEtudiantForm et;
	private MainForm mf;
	private LoginFormAction lfa;
	public AEFAction (addEtudiantForm et)
	{
		this.et=et;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
JButton bclique=(JButton) e.getSource();
		
		if (bclique==et.getIniNewButton())
		{
			et.getTextFieldPrenom().setText("");
			et.getTextFieldNom().setText("");
			et.getTextFieldNumPhone().setText("");
			et.getTextAreaAdress().setText("");
			et.getTextFieldAge().setText("");
			et.getButtonGroup().clearSelection();
			
			
			
			
			
		}
		else if (bclique==et.getReourButton())
		{
			mf=new MainForm();
			mf.setVisible(true);
			et.dispose();
			mf.getLabdelAdminName().setText(lfa.getAdmin());
		}

	}

}
