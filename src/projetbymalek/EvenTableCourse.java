package projetbymalek;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import projetbymalek.ManageCourses;

public class EvenTableCourse implements MouseListener {
	private ManageCourses mc;
	
	
	
	public EvenTableCourse (ManageCourses mc)
	{
		this.mc=mc;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {   
		// TODO Auto-generated method stub
	
		int i= mc.getTable().getSelectedRow();
		String id=(String) mc.getTable().getValueAt(i, 0);
		String nom=(String) mc.getTable().getValueAt(i, 1);
		String nb_h=(String) mc.getTable().getValueAt(i, 2);
		int nb=Integer.parseInt(nb_h);
		mc.getTextFieldID().setText(id);
		mc.getTextFieldNomDcours().setText(nom);
		mc.getSpinnerHeures().setValue(Integer.valueOf(nb));
		
		
		//Integer nb=Integer.parseInt(nb_h);
	//	mc.getTextFieldID().setText(id);
		//mc.getTextFieldNomDcours().setText(label);
		//mc.getSpinnerHeures(). setValue(nb);
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
