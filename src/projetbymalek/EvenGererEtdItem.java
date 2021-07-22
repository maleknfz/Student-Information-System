package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenGererEtdItem implements ActionListener {
	private MainForm mf;
	private MaanageEtudiantForm mef;
	public EvenGererEtdItem(MainForm mf) {
		super();
		this.mf = mf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mef=new MaanageEtudiantForm();
		mef.setVisible(true);
		mf.dispose();
		
		
	}

}
