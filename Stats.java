package tp1sem2;

import java.util.ArrayList;
import java.util.Collections;

public class Stats {
	
	public static Note meilleureNote(Etudiant e) {
		return Collections.max(e.getNotes());
	}
	
	public static Note moinsBonneNote(Etudiant e) {
		return Collections.min(e.getNotes());
	}
	
	public float moyenneNote(Etudiant e) {
	    ArrayList<Note> notes = e.getNotes();
	    float somme = 0;
	    for (Note n : notes) {
	    	somme += n.getValue();
	    }
	    return somme/notes.size();
	}
	
	public static Etudiant meilleureEtudiant(ArrayList<Etudiant> etudiants) {
		return Collections.max(etudiants);
	}
	
	public static Etudiant moinsBonEtudiant(ArrayList<Etudiant> etudiants) {
		return Collections.min(etudiants);
	}
	
	public float moyGroupe(ArrayList<Etudiant> etudiants) {	  
		float somme = 0;
		for (Etudiant e : etudiants) {
			somme += moyenneNote(e);
		 }
		     return somme / etudiants.size();
		}
	 
}
