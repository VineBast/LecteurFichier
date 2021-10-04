package Lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecteurPalindromique extends LectureDuFichier {
	protected BufferedReader br;
	protected StringBuffer sb;
	protected String ligne;
	protected ArrayList<String> liste;
	protected ArrayList<String> listeFinale;
	protected LecteurEndroit Endroit;
	
	public LecteurPalindromique(String cheminFichier) {
		super(cheminFichier);
		Endroit = new LecteurEndroit(cheminFichier);
	}
	
	public void charger() {
		Endroit.charger();
		try {          
		      br = new BufferedReader(new FileReader(super.fichier));  
		      sb = new StringBuffer(); 
		      liste = new ArrayList<String>();
		      listeFinale = new ArrayList<String>();

		      while((ligne = br.readLine()) != null) {
		    	liste.add(ligne);    
		      }
		      br.close();
		      
		      int i = liste.size() - 1;
		      while (i != -1) {
	    		  String[] tabString = liste.get(i).split("");
		    	  int j = tabString.length - 1;
		    	  ligne = "";
		    	  while (j != 0) {
		    		  ligne = ligne + tabString[j-1];
		    		  j=j-1;
		    	  }
		    	  listeFinale.add(ligne);
		    	  i=i-1;
		      }

		      i = 0;
		      while (i < listeFinale.size()) {
		    	  sb.append(listeFinale.get(i));
		    	  sb.append("\n");
		    	  i=i+1;
		      }		      
		      super.contenuFichier = sb;
		    }
		    catch(IOException e) {
		      e.printStackTrace();
		    }
	}
	public void lire() {
		Endroit.lire();
		super.lire();
	}

}
