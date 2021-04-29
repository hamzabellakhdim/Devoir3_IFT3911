import java.util.Scanner;

public class ControllerRecherche extends ClientController {
	DisplayVoyages visitor;

	public ControllerRecherche() {
		visitor = new DisplayVoyages();
	}

	/**
	 * 
	 * @param villeD
	 * @param villeA
	 * @param dateD
	 */
	public void chercherVoyage(String villeD, String villeA, String dateD) {

		System.out.println("\n\nTapez 'v' pour voir les vols.");
		System.out.println("Tapez 't' pour voir les trajets en train.");
		System.out.println("Tapez 'i' pour voir les itinéraires de paquebot.");

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	String response = myObj.nextLine();

		switch (response) {
			case "v" :
				visitor.visitVols();
				break;

			case "t" :
				visitor.visitTrajets();
				break;

			case "i" :
				visitor.visitItineraires();
				break;
		}
	}

}