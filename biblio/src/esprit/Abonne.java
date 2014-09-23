package esprit;

public class Abonne {
	
	private static int nbInstances = 0;
	
	private int numAbonne;
	private String nom;
	
	private Ouvrage emprunt;
	
	public Abonne(String nom) {
		nbInstances++;
		this.numAbonne = nbInstances;
		this.nom = nom;
	}

	public int getNumAbonne() {
		return numAbonne;
	}

	public void setNumAbonne(int numAbonne) {
		this.numAbonne = numAbonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ouvrage getEmprunt(){
		return emprunt;
	}
	
	public void setEmprunt(Ouvrage emprunt){
		this.emprunt = emprunt;
	}
	
	public String toString() {
		return "Abonne [numAbonne=" + numAbonne + ", nom=" + nom + "]";
	}
	
	public void info(){
		System.out.println("num abonne : " + numAbonne);
		System.out.println("nom : " + nom);
		System.out.println("emprunt : ");
		if (emprunt!=null) {
			emprunt.info();
		}else{
			System.out.println("pas d'emprunt");
		}
		
	}
	

}
