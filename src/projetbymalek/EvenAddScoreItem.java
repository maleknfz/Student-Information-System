package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenAddScoreItem implements ActionListener {
	private MainForm mf;
	private addScoreForm asf;
	

	public EvenAddScoreItem(MainForm mf) {
		super();
		this.mf = mf;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		asf=new addScoreForm();
		asf.setVisible(true);
		mf.dispose();
		
		
		
		
	}

}
