package metier;

public class student {
	private int id ;
	private String prenom;
	private String nom;
	private String sexe;
	private String age;
	private String telnum;
	private String adresse;
	
	public student()
	{
		
	}
	public student(String prenom, String nom, String sexe, String age, String telnum, String adresse) {
		super();
		//this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
		this.telnum = telnum;
		this.adresse = adresse;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getNom() {
		return nom;
	}
	public String getSexe() {
		return sexe;
	}
	public String getAge() {
		return age;
	}
	public String getTelnum() {
		return telnum;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

}
