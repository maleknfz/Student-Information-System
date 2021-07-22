package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

//import dao.CrudCatalogue;
import dao.CrudCouseAndScores;
import projetbymalek.ManageCourses;

public class EvenUpdateCours implements ActionListener {
	private ManageCourses mc;
	public EvenUpdateCours (ManageCourses mc)
	{
		super();
		this.mc=mc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane d=new JOptionPane();
		int retour= d.showConfirmDialog(mc, "Etes vous sûres de modifier cette course ??","Confirmation de modification",JOptionPane.YES_NO_OPTION);
		if(retour==JOptionPane.YES_OPTION)
		{
			CrudCouseAndScores cc=new CrudCouseAndScores();
			//public void updateCoruse(int id, String label, int nb_heures)
			//cc.updateCategorie(Integer.parseInt(mc.getTextID().getText()), mc.getTextNom().getText());
			
			int nb=(Integer) mc.getSpinnerHeures().getValue();
			
			cc.updateCoruse(Integer.parseInt(mc.getTextFieldID().getText()),mc.getTextFieldNomDcours().getText(),nb);
			
			
			
			
			mc.getCm().loadData(cc.getAllCourses());
			
		}
	}

}
