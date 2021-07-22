package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenAddCourItem implements ActionListener {
	private MainForm mf;
	private addCourseForm acf;
	public EvenAddCourItem(MainForm mf) {
		super();
		this.mf = mf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		acf=new addCourseForm();
		acf.setVisible(true);
		mf.dispose();
		
		

	}

}
