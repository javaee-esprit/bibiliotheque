package esprit;

public class Ouvrage {

	private String titre;
	private String dateCreation;
	private boolean existe;
	private Type type;

	public Ouvrage(String titre, String dateCreation) {
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.existe = true;
	}
	
	public Ouvrage(String titre, String dateCreation, Type type) {
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.existe = true;
		this.type = type;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isExiste() {
		return existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}

	public void info() {
		System.out.println("----------Ouvrage-------------");
		System.out.println("le titre est: " + titre);
		System.out.println("la date de creation est: " + dateCreation);
		if (existe == true) {
			System.out.println("l'ouvrage existe");

		} else {
			System.out.println("l'ouvrage n'existe pas");
		}
		System.out.println("------------------------------");
	}
	
	public String toString(){
		return "Ouvrage[titre="+titre+", dateCreation="+dateCreation+", existe="+existe+"]";
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
