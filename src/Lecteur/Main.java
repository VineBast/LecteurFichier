package Lecteur;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lecture à l'endroit du fichier :");
		System.out.println("\n");
		
		LecteurEndroit temp = new LecteurEndroit("test.txt");
		temp.charger();
		temp.lire();
		
		System.out.println("Lecture à l'envers du fichier :");
		System.out.println("\n");

		
		LecteurEnvers temp2 = new LecteurEnvers("test.txt");
		temp2.charger();
		temp2.lire();
		
		System.out.println("Lecture palindromique du fichier :");
		System.out.println("\n");
		
		LecteurPalindromique temp3 = new LecteurPalindromique("test.txt");
		temp3.charger();
		temp3.lire();
		
		System.out.println("Comparaison de deux fichiers :");
		System.out.println("\n");
		
		ComparateurFichiers temp4 = new ComparateurFichiers("test.txt", "test2.txt");
		temp4.charger();
		temp4.contenuComparaison();
	}

}
