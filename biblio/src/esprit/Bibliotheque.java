package esprit;

public class Bibliotheque {
	
	private String nom;
	private int nbOuvrages;
	private int nbAbonnes;
	
	private Ouvrage[] ouvrages;
	private Abonne[] abonnes;
	
	public Bibliotheque(String nom,int nbMaxOuvrages,int nbMaxAbonnes) {
		this.nom=nom;
		this.ouvrages=new Ouvrage[nbMaxOuvrages];
		this.abonnes=new Abonne[nbMaxAbonnes];
		this.nbOuvrages=0;
		this.nbAbonnes=0;
	}
	
	public Ouvrage rechercherOuvrage(String titre){
		Ouvrage recherche = null;
		boolean trouve = false;
		int i = 0;
		while( (i<nbOuvrages) && (!trouve)){
			if(ouvrages[i].getTitre().equals(titre)){
				recherche = ouvrages[i];
				trouve = true;
			}
			i++;
		}
		return recherche;	
	}
	public Ouvrage rechercherOuvrage(Ouvrage ouvrage){
		Ouvrage recherche = null;
		boolean trouve = false;
		int i = 0;
		while( (i<nbOuvrages) && (!trouve)){
			if(ouvrages[i].getTitre().equals(ouvrage.getTitre())){
				recherche = ouvrages[i];
				trouve = true;
			}
			i++;
		}
		return recherche;	
	}
	
	public int rechercherIndiceOuvrage(String titre){
		int recherche = -1;
		boolean trouve = false;
		int i = 0;
		while( (i<nbOuvrages) && (!trouve)){
			if(ouvrages[i].getTitre().equals(titre)){
				recherche = i;
				trouve = true;
			}
			i++;
		}
		return recherche;	
	}
	
	public void ajouterOuvrage(Ouvrage ouvrage){
		Ouvrage ouv = rechercherOuvrage(ouvrage.getTitre());
		
		if ((ouv==null)&& (nbOuvrages<ouvrages.length)) {
			ouvrages[nbOuvrages] = ouvrage;
			nbOuvrages++;
		} else {
			System.out.println("Ajout impossible");
		}
	}
	
	
	public Abonne rechercherAbonne(int numAbonne){
		Abonne recherche = null;
		boolean trouve = false;
//		int i = 0;
//		while( (i<nbAbonnes) && (!trouve)){
//			if(abonnes[i].getNumAbonne() == numAbonne){
//				recherche = abonnes[i];
//				trouve = true;
//			}
//			i++;
//		}
		
		for (int i = 0; (i<nbAbonnes) && (!trouve); i++) {
			if(abonnes[i].getNumAbonne() == numAbonne){
				recherche = abonnes[i];
				trouve = true;
			}
		}
		return recherche;	
	}
	
	
	public void ajouterAbonne(Abonne abonne){
		Abonne abon = rechercherAbonne(abonne.getNumAbonne());
		
		if ((abon==null)&& (nbAbonnes<abonnes.length)) {
			abonnes[nbAbonnes] =abonne;
			nbAbonnes++;
		} else {
			System.out.println("Ajout impossible");
		}
	}
	
	public void emprunter(String titre, int numAbonne){
		Abonne abonne = rechercherAbonne(numAbonne);
		Ouvrage ouvrage = rechercherOuvrage(titre);
		if ((ouvrage != null)&&//ouvrage exite
				(abonne != null)&&//abonne existe
					(abonne.getEmprunt()== null)&&//l'abonne n'a pas d'emprunt en cours
						(ouvrage.isExiste()== true)// l'ouvrage est disponible
				) {
			
			abonne.setEmprunt(ouvrage);
			ouvrage.setExiste(false);
			
		} else {
			System.out.println("Emprunt impossible");
		}
	}
	
	public void rendre(int numAbonne){
		Abonne abonne = rechercherAbonne(numAbonne);
		
		if (abonne != null) {
			Ouvrage emprunt = abonne.getEmprunt();
			if (emprunt != null) {
				abonne.setEmprunt(null);
				emprunt.setExiste(true);
			} else {
				System.out.println("L'abonne n'as pas d'emprunt");
			}
			
		}else{
			System.out.println("L'abonne n'existe pas");
		}
	}
	
	public void info(){
		System.out.println("---------BIBLIOTHEQUE--------");
		for (int i = 0; i < nbOuvrages; i++) {
			if (ouvrages[i].getType().equals(Type.LIVRE)) {
				ouvrages[i].info();
			}
		}
		
		for (int i = 0; i < nbAbonnes; i++) {
			if (abonnes[i].getEmprunt() != null) {
				abonnes[i].info();
			}
		}
		System.out.println("-----------------------------");
	}
	
	//homework
	public  void supprimerOuvrage(String titre){
		
	}
	
	//homework
	public  void supprimerAbonne(int numAbonne){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbOuvrages() {
		return nbOuvrages;
	}

	public void setNbOuvrages(int nbOuvrages) {
		this.nbOuvrages = nbOuvrages;
	}

	public int getNbAbonnes() {
		return nbAbonnes;
	}

	public void setNbAbonnes(int nbAbonnes) {
		this.nbAbonnes = nbAbonnes;
	}

	public Abonne[] getAbonnes() {
		return abonnes;
	}

	public void setAbonnes(Abonne[] abonnes) {
		this.abonnes = abonnes;
	}

	public Ouvrage[] getOuvrages(){
		return ouvrages;
	}
	
	public void setOuvrages(Ouvrage[] ouvrages){
		this.ouvrages = ouvrages;
	}

}
