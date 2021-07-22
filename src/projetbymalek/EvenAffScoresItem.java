package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenAffScoresItem implements ActionListener {
	private MainForm mf;
	private ViewScoreForm vsf;
	

	public EvenAffScoresItem(MainForm mf) {
		super();
		this.mf = mf;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		vsf=new ViewScoreForm();
		vsf.setVisible(true);
		mf.dispose();
	}

}
