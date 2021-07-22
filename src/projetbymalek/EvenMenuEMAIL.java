package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenMenuEMAIL implements ActionListener {
	 private ContactParForm cp; 
	 private EmailJform em;
	 

	public EvenMenuEMAIL(ContactParForm cp) {
		super();
		this.cp = cp;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		em=new EmailJform();
		em.setVisible(true);
		cp.add(em);
		
		

	}

}
