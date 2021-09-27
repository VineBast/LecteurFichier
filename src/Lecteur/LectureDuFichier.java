package Lecteur;

import java.io.File;

abstract class LectureDuFichier implements Lecteur {
	public File fichier;
	public StringBuffer contenuFichier;
	
	LectureDuFichier(String cheminFichier) {
		this.fichier = new File(cheminFichier);
	}
	
	public void lire() {
		System.out.println(this.contenuFichier);
	}	
	
}
