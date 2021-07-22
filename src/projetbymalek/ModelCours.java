package projetbymalek;

import java.awt.*;
import java.util.*;
import java.util.Vector;
import metier.course;
import javax.swing.table.AbstractTableModel;
import java.util.List;
public class ModelCours extends AbstractTableModel {
	private String[] colonnes=new String[] {"ID Course","Nom Course","Nb Heures"};
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
	public void loadData(List<course> cats) {
		lignes=new Vector<String[]>();
		for (course c: cats)
			lignes.add(new String[]{String.valueOf(c.getId()),c.getLabel(),String.valueOf(c.getNb_heures())});
		fireTableChanged(null);
	}
}



/*
package presentation;

import java.util.Vector;
import java.util.List;
import metier.Categorie;
import javax.swing.table.AbstractTableModel;

public class CategorieModel extends AbstractTableModel {
	private String[] colonnes=new String[] {"ID catégorie","Nom catégorie"};
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
	public void loadData(List<Categorie> cats) {
		lignes=new Vector<String[]>();
		for (Categorie c: cats)
			lignes.add(new String[]{String.valueOf(c.getIdCat()),c.getNomCat()});
		fireTableChanged(null);
	}
}

 */


/* package presentation;

import java.util.Vector;
import java.util.List;
import metier.Categorie;
import javax.swing.table.AbstractTableModel;

public class CategorieModel extends AbstractTableModel {
	private String[] colonnes=new String[] {"ID catégorie","Nom catégorie"};
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
	public void loadData(List<Categorie> cats) {
		lignes=new Vector<String[]>();
		for (Categorie c: cats)
			lignes.add(new String[]{String.valueOf(c.getIdCat()),c.getNomCat()});
		fireTableChanged(null);
	}
}
*/