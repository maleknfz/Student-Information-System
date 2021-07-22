package dao;
import java.util.List;

import metier.student;
public interface Icrude {
	public void addStudent(student e);
	public void DelStudent (int id);
	public void Updatestudent(String prenom, String nom, String sexe, String age, String telnum, String adresse, int id);
	public List<student> getAllStudents();
}
