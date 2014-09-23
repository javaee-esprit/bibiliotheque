package esprit;

public class Test {
	
	public static void main(String[] args) {
		Abonne a1 = new Abonne("slim");
		Abonne a2 = new Abonne("syrine");
		a1.equals(a2);
		
		Ouvrage o1 = new Ouvrage("1984", "7/12/1990", Type.LIVRE);
		Ouvrage o2 = new Ouvrage("L'étranger", "7/12/1992", Type.LIVRE);
		Ouvrage o3 = new Ouvrage("le livre noir", "7/12/1993", Type.MAGAZINE);
		Ouvrage o4 = new Ouvrage("Macbeth", "7/12/1994", Type.LIVRE);
		
		Bibliotheque b1 = new Bibliotheque("TUNIS", 100, 50);
		
		b1.ajouterAbonne(a1);
		b1.ajouterAbonne(a2);
		
		b1.ajouterOuvrage(o1);
		b1.ajouterOuvrage(o2);
		b1.ajouterOuvrage(o3);
		b1.ajouterOuvrage(o4);
		
		b1.emprunter("L'étranger", 2);
		b1.rendre(2);
		
		b1.info();
		
	}

}
