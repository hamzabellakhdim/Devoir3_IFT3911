import java.util.Scanner;

public class ClientView {
	CRUD_Client controllerClient;
	ControllerRecherche controllerRecherche;

	public ClientView() {
		this.controllerClient = new CRUD_Client();
		this.controllerRecherche = new ControllerRecherche();
	}

	public void afficherOptions() {
		System.out.println("\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'r' pour payer ou modifier une réservation.");
		System.out.println("Tapez 'v' pour chercher un voyage.");
		System.out.println("Tapez 'c' pour accéder à votre profil client ou créer un profil.\n\n");

		switch(response) {
			case "c" : 
				handleClients();
				break;

			case "r" :
				handleReservations();
				break;

			case "v" :
				handleVoyages();
				break;
			
			default :
				System.out.println("Veuillez taper soit 'r', soit 'v', soit 'c'.");
				break;
		}
		
	}

	public void handleClients() {

		System.out.println("\n\n=======================================================================================\n\n");
		System.out.println("Tapez 'a' pour ajouter un client.");
		System.out.println("Tapez 'm' pour modifier votre profil client.");
		System.out.println("Tapez 's' pour supprimer votre profil client.\n\n");

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    	String response = myObj.nextLine();

		switch(response) {
			case "a" : 
				System.out.println("\n\nVeuillez entrer votre adresse.");
				String adresse = myObj.nextLine();
				System.out.println("\nVeuillez entrer votre email.");
				String courriel = myObj.nextLine();
				System.out.println("\nVeuillez entrer votre numéro de téléphone.");
				String tel = myObj.nextLine();
				System.out.println("\nVeuillez entrer votre date de naissance.");
				String date_naissance = myObj.nextLine();
				System.out.println("\nVeuillez entrer votre numéro de passeport (vos données seront revendues à Facebook).");
				String num_passeport = myObj.nextLine();
				System.out.println("Veuillez entrer la date d'expiration de votre passeport (vos données seront revendues à Twitter).");
				String exp_passeport = myObj.nextLine();

				controllerClient.ajouterClient(adresse, courriel, tel, date_naissance, num_passeport, exp_passeport);
				break;

			case "m" :
				System.out.println("\n\nVeuillez entrer votre identifiant client.");
				String id = myObj.nextLine();

				controllerClient.modifierClient(id);
				break;

			case "s" :
				System.out.println("\n\nVeuillez entrer votre identifiant client.");
				String id2 = myObj.nextLine();

				controllerClient.supprimerClient(id2);
				break;
			
			default :
				System.out.println("Veuillez taper soit 'r', soit 'v', soit 'c'.");
				break;
		}

		myObj.close();
		afficherOptions();
	}

	public void handleReservations() {

	}

	public void handleVoyages() {
		System.out.println("\n\n=======================================================================================\n\n");
		System.out.println("Nous n'avons présentement que des voyages partant de Montréal.");

		controllerRecherche.chercherVoyage("Montreal", "any", "2021-04-29");

		afficherOptions();
	}

}