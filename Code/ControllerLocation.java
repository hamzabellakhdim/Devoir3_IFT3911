import java.util.Scanner;

public class ControllerLocation extends AdminController {

	public ControllerLocation(){

	}

	public Location ajouterLocation() {
		Location loc = null;
		Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'a' pour ajouter un aéroport.");
		System.out.println("Tapez 'g' pour ajouter une Gare.");
		System.out.println("Tapez 'p' pour ajouter un port.");
		String typeLocation = myObj2.nextLine();
		System.out.println("Veuillez rentrer l'id de la location.");
		String id = myObj2.nextLine();
		System.out.println("Veuillez rentrer la ville de la location.");
		String nom = myObj2.nextLine();
		switch(typeLocation){
			case "a":
				loc = new Aeroport(id, nom);
				break;
			case "g":
				loc = new Gare(id, nom);
				break;

			case "p":
				loc = new Port(id, nom);
				break;

			default:
				System.out.println("Veuillez taper soit 'a', soit 'g', soit 'p'.");

		}
		System.out.println("Location ajoutée");
		return loc;
	}

	public void supprimerLocation(Location L) {
		// TODO - implement ControllerLocation.supprimerLocation
		System.out.println("Location ajoutée");
	}

	public void modifierLocation(Location L) {
		// TODO - implement ControllerLocation.modifierLocation
		System.out.println("Location modifiée");
	}

}