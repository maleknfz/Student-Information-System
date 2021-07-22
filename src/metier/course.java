package metier;

public class course {
	private int id;
	private String label;
	private int nb_heures;
	public course( String label, int nb_heures) {
		super();
		//this.id = id;
		this.label = label;
		this.nb_heures = nb_heures;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getNb_heures() {
		return nb_heures;
	}
	public void setNb_heures(int nb_heures) {
		this.nb_heures = nb_heures;
	}
	
	
	
}
