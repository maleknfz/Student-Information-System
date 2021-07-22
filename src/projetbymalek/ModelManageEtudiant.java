package projetbymalek;

import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import metier.student;

public class ModelManageEtudiant extends AbstractTableModel {
	private String[] colonnes=new String[] {"ID Etudiant(e)", "Prenom", "Nom", "Sexe", "Age", "Tel", "Adresse"};
	private Vector<String[]> lignes;
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colonnes.length;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return lignes.size();
	}
	@Override
	public Object getValueAt(int rowIndex, int colunmIndex) {
		// TODO Auto-generated method stub
		return lignes.get(rowIndex)[colunmIndex];
	}
	@Override
	    public String getColumnName(int columnIndex) {
	        return colonnes[columnIndex];
	}
	public void loadData(List<student> std) {
		lignes=new Vector<String[]>();
		for (student s: std)
			lignes.add(new String[]{String.valueOf(s.getId()),s.getPrenom(),s.getNom(),s.getSexe(),s.getAge(),s.getTelnum(),s.getAdresse()});
		fireTableChanged(null);
	}
}