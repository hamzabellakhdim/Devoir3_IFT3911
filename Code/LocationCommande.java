import java.util.Scanner;

public class LocationCommande implements AdminCommande {

	private ControllerLocation cl = new ControllerLocation();

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'a' pour ajouter une location.");
		System.out.println("Tapez 'e' pour modifier une location.");
		System.out.println("Tapez 'd' pour supprimer une location.");
		System.out.println("Tapez 'r' pour rollback.");
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	String response = myObj.nextLine();
		Scanner myObj2;
		String typeLocation,id, ville;
		Location com;
		switch(response){
			case "a" :
				add();
				break;

			case "e" :
				myObj2 = new Scanner(System.in);  // Create a Scanner object
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				System.out.println("Tapez 'a' pour modifier une aeroport.");
				System.out.println("Tapez 'g' pour modifier une gare.");
				System.out.println("Tapez 'p' pour modifier une port.");
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");

				typeLocation = myObj2.nextLine();
				System.out.println("Veuillez rentrer l'id de la compagnie.");
				id = myObj2.nextLine();
				System.out.println("Veuillez rentrer la ville de la location.");
				ville = myObj2.nextLine();
				switch(typeLocation){
					case "a":
						com = new Aeroport(id, ville);
						edit(com);
					    break;
					case "f":
						com = new Gare(id, ville);
						edit(com);
						break;

					case "n":
						com = new Port(id, ville);
						edit(com);
						break;

					default:
						System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");

				}	
				
				break;

			case "d":
				myObj2 = new Scanner(System.in);  // Create a Scanner object
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				System.out.println("Tapez 'a' pour supprimer un aéroport.");
				System.out.println("Tapez 'g' pour supprimer une gare.");
				System.out.println("Tapez 'p' pour supprimer un port.");
				typeLocation = myObj2.nextLine();
				System.out.println("Veuillez rentrer l'id de la location.");
				id = myObj2.nextLine();
				System.out.println("Veuillez rentrer la ville de la location.");
				ville = myObj2.nextLine();
				
				switch(typeLocation){
					case "a":
						com = new Aeroport(id, ville);
						delete(com);
						break;
					case "f":
						com = new  Gare(id, ville);
						delete(com);
						break;

					case "n":
						com = new Port(id, ville);
						delete(com);
						break;
					
					default:
						System.out.println("Veuillez taper soit 'a', soit 'g', soit 'p'.");
						break;

				}	
				
				break;

			case "r":
				rollback();
				break;
			default:
				System.out.println("Veuillez taper soit 'r', soit 'v', soit 'c'.");
				break;
		}
		return false;
	}

	public Location add() {
		Location loc = cl.ajouterLocation();
		return loc;
	}

	/**
	 * 
	 * @param Location
	 */
	public void edit(Location l) {
		cl.modifierLocation(l);
	}

	/**
	 * 
	 * @param Location
	 */
	public void delete(Location l) {
		cl.supprimerLocation(l);
	}

	public boolean rollback() {
		// TODO - implement LocationCommande.rollback
		throw new UnsupportedOperationException();
	}

}