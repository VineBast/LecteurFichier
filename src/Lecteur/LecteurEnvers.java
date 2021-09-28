package Lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LecteurEnvers extends LectureDuFichier implements Lecteur {
	protected BufferedReader br;
	protected StringBuffer sb;
	protected String ligne;
	protected ArrayList<String> list = new ArrayList<String>();
		
	public LecteurEnvers(String cheminFichier) {
		super(cheminFichier);			
	}
	
	public void charger() {
		try {          
		      br = new BufferedReader(new FileReader(super.fichier));  
		      sb = new StringBuffer();   

		      while((ligne = br.readLine()) != null) {
		    	list.add(ligne);    
		      }
		      br.close();    

		      int i = list.size() - 1;
		      while (i != 0) {
		    	  sb.append(list.get(i));
		    	  sb.append("\n");
		    	  i=i-1;
		      }
		      super.contenuFichier = sb;
		    }
		    catch(IOException e) {
		      e.printStackTrace();
		    }
	}
	
}
