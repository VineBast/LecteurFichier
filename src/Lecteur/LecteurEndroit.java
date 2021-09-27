package Lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecteurEndroit extends LectureDuFichier implements Lecteur {
	BufferedReader br;
	StringBuffer sb;
	String ligne;
	
	public LecteurEndroit(String cheminFichier) {
		super(cheminFichier);
	}
	
	public void charger() {
		try {          
		      br = new BufferedReader(new FileReader(super.fichier));  
		      sb = new StringBuffer();    
		      while((ligne = br.readLine()) != null) {
		        sb.append(ligne);      
		        sb.append("\n");     
		      }
		      br.close();    
		      super.contenuFichier = sb;
		    }
		    catch(IOException e) {
		      e.printStackTrace();
		    }
		  }
}
