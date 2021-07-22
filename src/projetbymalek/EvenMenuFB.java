package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenMenuFB implements ActionListener {
	
	private FacebookJForm fb; 
	private ContactParForm cp;
	
	
	
	

	public EvenMenuFB(ContactParForm cp) {
		super();
		this.cp = cp;
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		fb=new FacebookJForm();
		fb.setVisible(true);
		cp.add(fb);
		
		

	}

}
