package tp1sem2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Etudiant> listEtudiants = new ArrayList<>();
		Stats stats = new Stats();
		
		Etudiant e1 = new Etudiant("1","eya");
		Etudiant e2 = new Etudiant("2","isslem");
		Etudiant e3 = new Etudiant("3", "ayette");
		
		listEtudiants.add(e1);
		e1.addNote("java",15f);
		e1.addNote("springboot",17f);
		
		listEtudiants.add(e2);
		e2.addNote("sgbd",16f);
		e2.addNote("symfony",17f);
		
		listEtudiants.add(e3);
		e3.addNote("uml",18f);
		e3.addNote("si",12f);
		
		Collections.sort(listEtudiants,new CompareNom());
        System.out.println("Tri par nom : ");
	        for (Etudiant etudiant : listEtudiants) {
	            System.out.println(" l'etudiant de matricule : "+ etudiant.getMatricule() + " de Nom : " + etudiant.getNom());
	        }
	   
	    Collections.sort(listEtudiants,new CompareMatricule());
	    System.out.println("Tri par matricule : ");
	    for (Etudiant etudiant : listEtudiants) {
		     System.out.println("l'etudiant de matricule : "+etudiant.getMatricule() + " de Nom :  " + etudiant.getNom());
		}
	    
	    
	    System.out.println("les moyennes des etudiants : ");
        for (Etudiant etudiant : listEtudiants) {
            System.out.println("Etudiant: " + etudiant.getNom());
            System.out.println("Moyenne: " + etudiant.getValue()); 
            System.out.println("Meilleure note : " + Stats.meilleureNote(etudiant));
            System.out.println("Moins bonne note : " + Stats.moinsBonneNote(etudiant));
            System.out.println();
        }
        
        
        
        System.out.println("les groupes : ");
        System.out.println("Moyenne du groupe : " + stats.moyGroupe(listEtudiants));
    
        Etudiant meilleurEtudiant = stats.meilleureEtudiant(listEtudiants);
        Etudiant moinsBonEtudiant = stats.moinsBonEtudiant(listEtudiants);

        System.out.println("Meilleur etudiant du groupe : ");
        System.out.println("Matricule : " + meilleurEtudiant.getMatricule());
        System.out.println("Nom : " + meilleurEtudiant.getNom());
        System.out.println("Moyenne : " + stats.moyenneNote(meilleurEtudiant));
       
        
        System.out.println("Moins bon etudiant du groupe : ");
        System.out.println("Matricule : " + moinsBonEtudiant.getMatricule());
        System.out.println("Nom : " + moinsBonEtudiant.getNom());
        System.out.println("Moyenne : " + stats.moyenneNote(moinsBonEtudiant));


	}

}
