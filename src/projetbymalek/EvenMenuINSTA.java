package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenMenuINSTA implements ActionListener {
	private ContactParForm cp; 
	private InstagramJForm inst;

	public EvenMenuINSTA(ContactParForm cp) {
		super();
		this.cp = cp;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		inst=new InstagramJForm();
		inst.setVisible(true);
		cp.add(inst);
		
		
		
	}

}
