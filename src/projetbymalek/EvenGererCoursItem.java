package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenGererCoursItem implements ActionListener {
	private ManageCourses mc;
	private MainForm mf;
	
	public EvenGererCoursItem(MainForm mf) {
		super();
		this.mf = mf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mc=new ManageCourses();
		mc.setVisible(true);
		mf.dispose();
		
		

	}

}
