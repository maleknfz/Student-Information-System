package dao;

import java.util.List;

import metier.*;

public interface Icrude2 {
	//methodes pour les cours :p
	public void AddCourse(course ce);
	public void SuppCourse(int id);
	public void updateCoruse(int id, String label, int nb_heures);
	public List<course> getAllCourses();
	//methodes pour scores :p
	public void AddScore(score c);
	public void SuppScore(int idE,int idC);
	public void updateScore(int idE,int idC,String note,String Description);
	public List<score> getAllscores();
	/* 




	//Méthodes pour gérer le menu Catégorie
		public void addCategorie(Categorie c);
		public List<Categorie> getAllCategories();
		public void updateCategorie(int idCat,String newNom);
		public int getIdCategorie(String nom);
		
		//Méthodes pour gérer le menu Produit
		public void addProduit(Produit p, int idCat);
		public List<Produit> getAllProduits();
		public void deleteProduit(String refProd);
		public List<Produit> getProduitsParCat(int idCat);
		*/
	
	
}
