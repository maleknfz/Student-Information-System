package projetbymalek;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import projetbymalek.addScoreForm;
public class EvenAddScoreTable implements MouseListener {
	private addScoreForm sf ;
	
	
	
	
	public EvenAddScoreTable(addScoreForm sf) {
		super();
		this.sf = sf;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int i= sf.getTable().getSelectedRow();
		String id=(String) sf.getTable().getValueAt(i, 0);
		sf.getTextFieldETDID().setText(id);
		//String nom=(String) mc.getTable().getValueAt(i, 1);
		//String nb_h=(String) mc.getTable().getValueAt(i, 2);
		//int nb=Integer.parseInt(nb_h);
		
		//mc.getTextFieldNomDcours().setText(nom);
		//mc.getSpinnerHeures().setValue(Integer.valueOf(nb));
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
