package projetbymalek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.CrudStudent;
import projetbymalek.MaanageEtudiantForm;
public class EvenDeleteEtd implements ActionListener {
	MaanageEtudiantForm ms;
	
	public EvenDeleteEtd (MaanageEtudiantForm ms)
	{
		super();
		this.ms=ms;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 CrudStudent cs=new CrudStudent();
		 int id=Integer.parseInt(ms.getcomboBox().getSelectedItem().toString());
		 
		// System.out.print(id);
		 cs.DelStudent(id);
		 ms.getCm().loadData(cs.getAllStudents());
		 
		 

	}

}
