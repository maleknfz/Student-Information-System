package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenAffBonNotesItem implements ActionListener {
	private BonNoteForm bn;
	private MainForm mf;
	

	public EvenAffBonNotesItem(MainForm mf) {
		super();
		this.mf = mf;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		bn=new BonNoteForm();
		bn.setVisible(true);
		mf.dispose();
	}

}
