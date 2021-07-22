package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenAffMauvaisesNotesItem implements ActionListener {
	private MainForm mf;
	private MauvaisNoteForm vsf;
	

	public EvenAffMauvaisesNotesItem(MainForm mf) {
		super();
		this.mf = mf;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		vsf=new MauvaisNoteForm();
		vsf.setVisible(true);
		mf.dispose();
	}

}
