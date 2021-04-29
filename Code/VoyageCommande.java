import java.util.Scanner;

public class VoyageCommande implements AdminCommande {

	private ControllerVoyage cv = new ControllerVoyage();

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
		String typeLocation, idSiege, idSection, idmoyenTrans, id, lieuDep, lieuArr;
		boolean etat;
		int duree;
		double prix;
		long dep, arr;
		Voyage voy;
		switch(response){
			case "a" :
				add();
				break;

			case "e" :
				myObj2 = new Scanner(System.in);  // Create a Scanner object
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				System.out.println("Tapez 'v' pour ajouter une vol.");
				System.out.println("Tapez 't' pour ajouter un voyage en train.");
				System.out.println("Tapez 'i' pour ajouter un itinéraire	.");
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				typeLocation = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id du siege du voyage.\n");
				idSiege = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id de la section du voyage.\n");
				idSection = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id du moyen de transport.\n");
				idmoyenTrans = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id du voyage.\n");
				id = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer le lieu de départ du voyage\n.");
				lieuDep = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer le lieu d'arrivée du voyage.\n");
				lieuArr = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'état du voyage.\n");
				etat = myObj2.nextBoolean();
				System.out.println("\nVeuillez rentrer la durée du voyage.\n");
				duree = myObj2.nextInt()
				System.out.println("\nVeuillez rentrer le prix du voyage.\n");
				prix = myObj2.nextDouble();
				System.out.println("\nVeuillez rentrer la date de départ du voyage.\n");
				dep = myObj.nextLong();
				System.out.println("\nVeuillez rentrer le date d'arrivée du voyage.\n");
				arr = myObj.nextLong();
				switch(typeLocation){
					case "v":
						voy = new Vol(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr);
						edit(voy);
					    break;
					case "t":
						voy = new V_en_train(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr)
						edit(voy);
						break;

					case "i":
						voy = new Itineraire(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr) ;
						edit(voy);
						break;

					default:
						System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");

				}	
				
				break;

			case "d":
				myObj2 = new Scanner(System.in);  // Create a Scanner object
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				System.out.println("Tapez 'v' pour supprimer une vol.");
				System.out.println("Tapez 't' pour supprimer un voyage en train.");
				System.out.println("Tapez 'i' pour supprimer un itinéraire	.");
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				typeLocation = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id du siege du voyage.\n");
				idSiege = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id de la section du voyage.\n");
				idSection = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id du moyen de transport.\n");
				idmoyenTrans = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'id du voyage.\n");
				id = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer le lieu de départ du voyage\n.");
				lieuDep = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer le lieu d'arrivée du voyage.\n");
				lieuArr = myObj2.nextLine();
				System.out.println("\nVeuillez rentrer l'état du voyage.\n");
				etat = myObj2.nextBoolean();
				System.out.println("\nVeuillez rentrer la durée du voyage.\n");
				duree = myObj2.nextInt()
				System.out.println("\nVeuillez rentrer le prix du voyage.\n");
				prix = myObj2.nextDouble();
				System.out.println("\nVeuillez rentrer la date de départ du voyage.\n");
				dep = myObj.nextLong();
				System.out.println("\nVeuillez rentrer le date d'arrivée du voyage.\n");
				arr = myObj.nextLong();
				switch(typeLocation){
					case "v":
						voy = new Vol(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr);
						delete(voy);
						break;
					case "t":
						voy = new V_en_train(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr)
						delete(voy);
						break;

					case "i":
						voy = new Itineraire(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr) ;
						delete(voy);
						break;

					default:
						System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");

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

	public Voyage add() {
		// TODO - implement VoyageCommande.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Voyage
	 */
	public void edit(Voyage v) {
		// TODO - implement VoyageCommande.edit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Voyage
	 */
	public void delete(Voyage v) {
		// TODO - implement VoyageCommande.delete
		throw new UnsupportedOperationException();
	}


	@Override
	public boolean rollback() {
		// TODO Auto-generated method stub
		return false;
	}

}