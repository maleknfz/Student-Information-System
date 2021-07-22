package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.CrudCouseAndScores;
import projetbymalek.ManageCourses;

public class EvenDeleteCourse implements ActionListener {
	private ManageCourses mc;
	public EvenDeleteCourse (ManageCourses mc)
	{
		super();
		this.mc=mc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane d=new JOptionPane();
		int retour=d.showConfirmDialog(mc, "Voulez vous supprimer ce course !!?","Validation de suppression",
				JOptionPane.YES_NO_OPTION);
		if(retour==JOptionPane.YES_OPTION)
		{
			CrudCouseAndScores cc=new CrudCouseAndScores();
			cc.SuppCourse(Integer.parseInt(mc.getTextFieldID().getText()));
			mc.getCm().loadData(cc.getAllCourses());
		}
		
		
		
		
		
	}

}
