import java.util.Scanner;

public class Main_View {

	/**
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n================================================================================================================");
		System.out.println("\n\nBienvenue dans le meilleur logiciel de réservation du cours IFT3911 !\n");

		System.out.println("Tapez 'c' si vous êtes un client.");
		System.out.println("Tapez 'a' si vous êtes un admin.");
		System.out.println("\n\n(non on a pas utilisé de switch case o_O)\n\n");

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	String response = myObj.nextLine();

		switch(response) {
			case "c" : 
				ClientView client = new ClientView();
				client.afficherOptions();
				break;

			case "a" :
				System.out.println("Veuillez entrer le mot de passe.");
				response = myObj.nextLine();
				System.out.println("\n\n\n\nDu premier coup !\n\n");

				AdminView admin = new AdminView();
				admin.afficherCRUD();
				break;
			
			default :
				System.out.println("Veuillez taper soit 'a' soit 'c'.");
				break;
		}

	}

}