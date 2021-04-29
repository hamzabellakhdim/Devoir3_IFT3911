import java.util.Scanner;

public class CompagnieAerienneFactory extends AbstractCompagnieFactory {

	public CompagnieAerienne create() {
		// TODO - implement CompagnieAerienneFactory.create
		Scanner myObj = new Scanner(System.in); 
		CompagnieAerienne com;
		System.out.println("Veuillez rentrer l'id de la compagnie.\n\n\n\n");
		String id = myObj.nextLine();
		System.out.println("Veuillez rentrer le nom de la compagnie.\n\n\n\n");
		String nom = myObj.nextLine();
		com = new CompagnieAerienne(id, nom);
		myObj.close();
		return com;
	}

}