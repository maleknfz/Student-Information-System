package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projetbymalek.MaanageEtudiantForm;
import projetbymalek.MainForm;

public class EvenRetourEtd implements ActionListener {
private MaanageEtudiantForm ms;
private MainForm mf;
private LoginFormAction lfa;	
	public EvenRetourEtd (MaanageEtudiantForm ms)
	{
		super();
		this.ms=ms;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mf=new MainForm ();
		mf.setVisible(true);
		ms.dispose();
	
		mf.getLabdelAdminName().setText(lfa.getAdmin());
	}

}
