package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenhelpMenuItem implements ActionListener {
	private MainForm mf;
	private ContactParForm cp;

	public EvenhelpMenuItem(MainForm mf) {
		super();
		this.mf = mf;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cp=new ContactParForm(); cp.setVisible(true); mf.dispose();
		
		

	}

}
