package Lecteur;

import java.io.File;

abstract class LectureDuFichier implements Lecteur {
	protected File fichier;
	protected File fichier2;
	protected StringBuffer contenuFichier;
	protected String diff;
	
	public LectureDuFichier(String cheminFichier) {
		this.fichier = new File(cheminFichier);
	}
	
	public LectureDuFichier(String cheminFichier, String cheminFichier2) {
		this.fichier = new File(cheminFichier);
		this.fichier2 = new File(cheminFichier2);
	}
	
	public void lire() {
		System.out.println(this.contenuFichier);
	}	
	
	public void contenuComparaison() {
		System.out.println(this.diff);
	}
}
