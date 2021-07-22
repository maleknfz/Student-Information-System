package projetbymalek;

import java.util.*;

import javax.swing.table.AbstractTableModel;

public class StudentModel extends AbstractTableModel {
	private String nomco []=new String[] {
			"ID", "Prenom", "Nom", "Sexe", "Age", "Tel", "Adresse"
	};
	
	private Vector<String[]> ligne =new Vector<String[]> ();
	
	
	/* */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return nomco.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return ligne.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
		
	}

}

