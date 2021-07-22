package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CrudCouseAndScores;
import metier.*;
import projetbymalek.addCourseForm;

public class EvenAddCourse implements ActionListener {
	private addCourseForm cf;
	
	public EvenAddCourse(addCourseForm cf)
	{
		this.cf=cf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		CrudCouseAndScores cc=new CrudCouseAndScores();
		course c;
		
		int nb=(Integer) cf.getSpinnerHeures().getValue();
		try {
		c=new course(cf.getTextFieldNomdeCours().getText(),nb);
		cc.AddCourse(c);
		}
		catch(Exception ee) {
			JOptionPane.showMessageDialog(cf, ee.getMessage());
		}
		

	}

}
