import java.util.Scanner;

public class ControllerCompagnie extends AdminController {

    public ControllerCompagnie(){
		
	}

	public Compagnie ajouterCompagnie() {
		Compagnie com = null;
		Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'a' pour modifier une compagnie aerienne.");
		System.out.println("Tapez 'f' pour modifier une compagnie ferroviaire.");
		System.out.println("Tapez 'n' pour modifier une compagnie navale.\n\n");
		String typeCompany = myObj2.nextLine();
		System.out.println("Veuillez rentrer l'id de la compagnie.");
		String id = myObj2.nextLine();
		System.out.println("Veuillez rentrer le nom de la compagnie.");
		String nom = myObj2.nextLine();
		switch(typeCompany){
			case "a":
				com = new CompagnieAerienne(id, nom);
				break;
			case "f":
				com = new CompagnieFerroviaire(id, nom);
				break;

			case "n":
				com = new CompagnieNavale(id, nom);
				break;

			default:
				System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");

		}
		System.out.println("Compagnie ajoutée");
		myObj2.close();
		return com;
	}

	public void supprimerCompagnie(Compagnie c) {
		// TODO - implement ControllerCompagnie.supprimerCompagnie
		System.out.println("Compagnie supprimée");
	}

	public void modifierCompagnie(Compagnie c) {
		System.out.println("Compagnie modifiée");
	}

}