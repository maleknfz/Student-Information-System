package metier;

public class score {
private int etdID;
private int coursID;
private String etdScore;
private String description;
public score(int etdID, int coursID, String etdScore, String description) {
	super();
	this.etdID = etdID;
	this.coursID = coursID;
	this.etdScore = etdScore;
	this.description = description;
}
public score() {
	// TODO Auto-generated constructor stub
	super();
}
public int getEtdID() {
	return etdID;
}
public void setEtdID(int etdID) {
	this.etdID = etdID;
}
public int getCoursID() {
	return coursID;
}
public void setCoursID(int coursID) {
	this.coursID = coursID;
}
public String getEtdScore() {
	return etdScore;
}
public void setEtdScore(String etdScore) {
	this.etdScore = etdScore;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}





}
