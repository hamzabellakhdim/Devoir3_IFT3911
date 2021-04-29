import java.util.Random;
import jdk.vm.ci.code.CodeUtil;
import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;


public class ClientGestion implements Gestionnaire {
	ArrayList<Client> clients;


	public ClientGestion() {
		ModifClient observateur = new ModifClient();
		attach(observateur);

		this.clients = new ArrayList<Client>();
	}

	public Client ajouter(String adresse, String courriel, String tel, String dateNaissance, String numPasseport, String expPasseport) {
		//génération d'un id
		Random r = new Random();
		int low = 10;
		int high = 100000;
		int result = r.nextInt(high-low) + low;
		String id = Integer.toString(result);

		Client newClient = new Client(id, adresse, courriel, tel , dateNaissance, numPasseport, expPasseport);
		this.clients.add(newClient);

		return newClient;
	}

	public void supprimer(String id) {
		boolean exists = false;

		for (int i = 0 ; i < this.clients.size(); i++) {
			Client c = this.clients.get(i);
			if (c.getId().equals(id)) {
				System.out.println("Client numéro " + id + " supprimé.");
				this.clients.remove(c);
				exists = true;
				break;
			}
		}
		if (!(exists)) {
			System.out.println("Aucun client avec cet ID.");
		}
	}

	public void modifier(String id) {
		Client client;
		boolean exists = false;

		for (int i = 0 ; i < this.clients.size(); i++) {
			Client c = this.clients.get(i);
			if (c.getId().equals(id)) {
				exists = true;
				client = c;
				System.out.println("\n\nTapez 'a' pour modifier votre adresse.");
				System.out.println("Tapez 'c' pour modifier votre courriel.");
				System.out.println("Tapez 't' pour modifier votre numero de telephone.");
				
				Scanner myObj = new Scanner(System.in);  // Create a Scanner object
				String response = myObj.nextLine();

				switch (response) {
					case "a" :
						System.out.println("\n\nTapez votre nouvelle adresse.");
						String newAdresse = myObj.nextLine();
						client.setAdresse(newAdresse);
						break;

					case "c" :
						System.out.println("\n\nTapez votre nouveau courriel");
						String newCourriel = myObj.nextLine();
						client.setCourriel(newCourriel);
						break;

					case "t" :
						System.out.println("\n\nTapez votre nouveau numero.");
						String tel = myObj.nextLine();
						client.setTelephone(tel);
						break;

					default :
						System.out.println("Veuillez entrer un caractère valide.");
						break;
				}

				myObj.close();
				System.out.println("\n\nInformations modifiées.");
			}
		}
		if (!(exists)) {
			System.out.println("Aucun client avec cet ID.");
		}
	}

	public void notify_() {
		
	}

	/**
	 * 
	 * @param ModifClient
	 */
	public void attach(ModifClient observateur) {
		SujetConcret sujet = new SujetConcret();
		sujet.attach(observateur);
	}

	/**
	 * 
	 * @param ModifClient
	 */
	public void detach(ModifClient observateur) {
		
	}

}