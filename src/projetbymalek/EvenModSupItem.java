package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenModSupItem implements ActionListener {
	private MainForm mf;
	private ManageScores ms;
	

	public EvenModSupItem(MainForm mf) {
		super();
		this.mf = mf;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ms=new ManageScores();
		ms.setVisible(true);
		mf.dispose();
	}

}
