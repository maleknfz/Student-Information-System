package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetbymalek.*;

public class EvenRetourManangeCours implements ActionListener {
	private ManageCourses mc;
	private MainForm mf;
	private LoginFormAction lfa;
	
	
	
	public EvenRetourManangeCours(ManageCourses mc) {
		super();
		this.mc = mc;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mf=new MainForm();
		mf.setVisible(true);
		mc.dispose();
		mf.getLabdelAdminName().setText(lfa.getAdmin());
		
		
		
	}

}
