package projetbymalek;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import projetbymalek.ManageScores;

public class EvenTableManageScore implements MouseListener {
	private ManageScores ms;

	public EvenTableManageScore(ManageScores ms) {
		super();
		this.ms = ms;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int i= ms.getTable().getSelectedRow();
		String idE=(String) ms.getTable().getValueAt(i, 0);
		String idC=(String) ms.getTable().getValueAt(i, 1);
		String note=(String) ms.getTable().getValueAt(i, 2);
		String desc=(String) ms.getTable().getValueAt(i, 3);
		ms.getTextFieldEtudianteID().setText(idE);
		ms.getTextFieldIDCours().setText(idC);
		ms.getTextFieldNote().setText(note);
		ms.getTextFieldDescription().setText(desc);
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
