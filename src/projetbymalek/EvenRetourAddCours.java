package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetbymalek.*;

public class EvenRetourAddCours implements ActionListener {
	private addCourseForm asf;
	private MainForm mf;
	private LoginFormAction lfa;
	
	public EvenRetourAddCours(addCourseForm asf) {
		super();
		this.asf = asf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	mf=new MainForm();
	mf.setVisible(true);
	asf.dispose();
	mf.getLabdelAdminName().setText(lfa.getAdmin());

	}

}
