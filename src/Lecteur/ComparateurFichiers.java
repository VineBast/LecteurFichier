package Lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ComparateurFichiers extends LectureDuFichier {
	protected BufferedReader br;
	protected StringBuffer sb;
	protected BufferedReader br2;
	protected String ligneFichier;
	protected String ligneFichier2;
	protected String retourComparaison;
	protected ArrayList<String> listeFichier;
	protected ArrayList<String> listeFichier2;

	
	public ComparateurFichiers(String cheminFichier, String cheminFichier2) {
		super(cheminFichier, cheminFichier2);
	}
	
	public void charger() {
		try {          
		      br = new BufferedReader(new FileReader(super.fichier));  
		      sb = new StringBuffer();   		      
		      br2 = new BufferedReader(new FileReader(super.fichier2));  
		      listeFichier = new ArrayList<String>();
		      listeFichier2 = new ArrayList<String>();

		      while((ligneFichier = br.readLine()) != null) {
		    	listeFichier.add(ligneFichier);    
		      }
		      br.close();
		      
		      while((ligneFichier2 = br2.readLine()) != null) {
		    	listeFichier2.add(ligneFichier2);    
		      }
		      br2.close();
		      
		      int i = 0;
		      retourComparaison = "";
		      
		      while (i < listeFichier.size()) {
	    		  String[] tabString = listeFichier.get(i).split("");
	    		  String[] tabString2 = listeFichier2.get(i).split("");

		    	  int j = 0;
		    	  while (j < tabString.length - 1) {
		    		  String string = tabString[j];
		    		  String string2 = tabString2[j];
		    		  if(string.equals(string2) == false) {
		    			  retourComparaison = retourComparaison + "Différence(s) à la ligne : "+i+1+"\n";
		    			  break;
		    		  }
		    		  j=j+1;
		    	  }
		    	  i=i+1;
		      }	   
		      super.diff = retourComparaison;
		    }
		    catch(IOException e) {
		      e.printStackTrace();
		    }
	}
}
