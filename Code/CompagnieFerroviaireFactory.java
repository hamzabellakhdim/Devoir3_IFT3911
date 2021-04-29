import java.util.Scanner;

public class CompagnieFerroviaireFactory extends AbstractCompagnieFactory {

	public CompagnieFerroviaire create() {
		CompagnieFerroviaire com;
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Veuillez rentrer l'id de la compagnie.\n\n\n\n");
		String id = myObj.nextLine();
		System.out.println("Veuillez rentrer le nom de la compagnie.\n\n\n\n");
		String nom = myObj.nextLine();
		com = new CompagnieFerroviaire(id, nom);
		myObj.close();
		return com;
	}

}