import java.util.Scanner;

public class AdminView {

	public void afficherCRUD() {
		System.out.println("\n\n\n\n\n\n\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'c' pour modifier les compagnies.");
		System.out.println("Tapez 'l' pour modifier les locations.");
		System.out.println("Tapez 'v' pour modifier les voyages.\n\n\n\n");
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	String response = myObj.nextLine();

		switch(response){
			case "c" :
				handleCompagnies();
				break;

			case "l" :
				handleLocations();
				break;

			case "v":
			    handleVoyages();
				break;

			default:
				System.out.println("Veuillez taper soit 'r', soit 'v', soit 'c'.");
				break;
			  
		}
	}

	private void handleCompagnies() {
		CompagnieCommande cc = new CompagnieCommande();
		cc.execute();
	}

	private void handleLocations() {
		LocationCommande lc = new LocationCommande();
		lc.execute();
	
	}

	private void handleVoyages() {
		VoyageCommande vc = new VoyageCommande();
		vc.execute();
	}

}