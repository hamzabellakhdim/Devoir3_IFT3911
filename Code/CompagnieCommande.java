import java.util.Scanner;

public class CompagnieCommande implements AdminCommande {

	private ControllerCompagnie cc = new ControllerCompagnie();

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'a' pour ajouter une compagnie.");
		System.out.println("Tapez 'e' pour modifier une compagnie.");
		System.out.println("Tapez 'd' pour supprimer une compagnie.");
		System.out.println("Tapez 'r' pour rollback.\n\n");
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	String response = myObj.nextLine();
		Scanner myObj2;
		String typeCompany,id, nom;
		Compagnie com;
		switch(response){
			case "a" :
				add();
				break;

			case "e" :
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				System.out.println("Tapez 'a' pour modifier une compagnie aerienne.");
				System.out.println("Tapez 'f' pour modifier une compagnie ferroviaire.");
				System.out.println("Tapez 'n' pour modifier une compagnie navale.\n\n\n\n");
				typeCompany = myObj.nextLine();
				System.out.println("Veuillez rentrer l'id de la compagnie.\n\n\n\n");
				id = myObj.nextLine();
				System.out.println("Veuillez rentrer le nom de la compagnie.\n\n\n\n");
				nom = myObj.nextLine();
				switch(typeCompany){
					case "a":
						com = new CompagnieAerienne(id, nom);
						edit(com);
					    break;
					case "f":
						com = new CompagnieFerroviaire(id, nom);
						edit(com);
						break;

					case "n":
						com = new CompagnieNavale(id, nom);
						edit(com);
						break;

					default:
						System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");

				}	
				
				break;

			case "d":
				myObj2 = new Scanner(System.in);  // Create a Scanner object
				System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
				System.out.println("Tapez 'a' pour supprimer une compagnie aerienne.");
				System.out.println("Tapez 'f' pour supprimer une compagnie ferroviaire.");
				System.out.println("Tapez 'n' pour supprimer une compagnie navale.\n\n\n\n");
				typeCompany = myObj2.nextLine();
				System.out.println("Veuillez rentrer l'id de la compagnie.\n\n\n\n");
				id = myObj2.nextLine();
				System.out.println("Veuillez rentrer le nom de la compagnie.\n\n\n\n");
				nom = myObj2.nextLine();
				
				switch(typeCompany){
					case "a":
						com = new CompagnieAerienne(id, nom);
						delete(com);
						break;
					case "f":
						com = new CompagnieFerroviaire(id, nom);
						delete(com);
						break;

					case "n":
						com = new CompagnieNavale(id, nom);
						delete(com);
						break;
					
					default:
						System.out.println("Veuillez taper soit 'a', soit 'f', soit 'n'.");
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

	public Compagnie add() {
		// TODO - implement CompagnieCommande.add
		Compagnie com = cc.ajouterCompagnie();
		return com;

	}

	/**
	 * 
	 * @param Compagnie
	 */
	public void edit(Compagnie C) {
		// TODO - implement CompagnieCommande.edit
		cc.modifierCompagnie(C);
	}

	/**
	 * 
	 * @param Compagnie
	 */
	public void delete(Compagnie C) {
		// TODO - implement CompagnieCommande.delete
		cc.supprimerCompagnie(C);
	}

	public boolean rollback() {
		// TODO - implement CompagnieCommande.rollback
		throw new UnsupportedOperationException();
	}



}