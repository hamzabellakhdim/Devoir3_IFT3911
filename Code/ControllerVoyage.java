import java.util.Scanner;

public class ControllerVoyage extends AdminController {

	public Voyage ajouterVoyage() {
		Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'v' pour ajouter une vol.");
		System.out.println("Tapez 't' pour ajouter un voyage en train.");
		System.out.println("Tapez 'i' pour ajouter un itinéraire	.");
		System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
		
		Voyage voy = null;
		String typeLocation = myObj2.nextLine();
		System.out.println("\nVeuillez rentrer l'id du siege du voyage.\n");
		
		String idSiege = myObj2.nextLine();
		System.out.println("\nVeuillez rentrer l'id de la section du voyage.\n");
		
		String idSection = myObj2.nextLine();
		System.out.println("\nVeuillez rentrer l'id du moyen de transport.\n");
		
		String idmoyenTrans = myObj2.nextLine();
		System.out.println("\nVeuillez rentrer l'id du voyage.\n");
		
		String id = myObj2.nextLine();
		System.out.println("\nVeuillez rentrer le lieu de départ du voyage\n.");
		
		String lieuDep = myObj2.nextLine();
		System.out.println("\nVeuillez rentrer le lieu d'arrivée du voyage.\n");
		
		String lieuArr = myObj2.nextLine();
		System.out.println("\nVeuillez rentrer l'état du voyage.\n");
		
		boolean etat = myObj2.nextBoolean();
		System.out.println("\nVeuillez rentrer la durée du voyage.\n");
		
		int duree = myObj2.nextInt();
		System.out.println("\nVeuillez rentrer le prix du voyage.\n");
		
		double prix = myObj2.nextDouble();
		System.out.println("\nVeuillez rentrer la date de départ du voyage.\n");
		
		long dep = myObj2.nextLong();
		System.out.println("\nVeuillez rentrer le date d'arrivée du voyage.\n");
		
		long arr = myObj2.nextLong();
		switch(typeLocation){
			case "v":
				voy = new Vol(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr);
				break;
			case "t":
				voy = new V_en_train(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr);
				break;

			case "i":
				voy = new Itineraire(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr) ;
				break;

			default:
				System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");

		}	
		myObj2.close();
		return voy;		
	}

	public void supprimerVoyage(Voyage v) {
		// TODO - implement ControllerVoyage.supprimerVoyage
		throw new UnsupportedOperationException();
	}

	public void modifierVoyage(Voyage v) {
		// TODO - implement ControllerVoyage.modifierVoyage
		throw new UnsupportedOperationException();
	}

}