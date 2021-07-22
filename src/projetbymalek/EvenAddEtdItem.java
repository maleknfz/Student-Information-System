package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenAddEtdItem implements ActionListener {
	private addEtudiantForm aef;
	private MainForm mf;

	public EvenAddEtdItem(MainForm mf) {
		super();
		this.mf = mf;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		aef=new addEtudiantForm();
		aef.setVisible(true);
		mf.dispose();
		
		
		

	}

}
