package tp1sem2;
import java.util.Comparator;

public class CompareMatricule implements Comparator<Etudiant>  {
	
		public int compare(Etudiant e1 , Etudiant e2) {
			
			return e1.getMatricule().compareTo(e2.getMatricule());
		}
}
