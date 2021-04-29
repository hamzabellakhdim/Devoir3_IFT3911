import java.util.Random;
import java.util.ArrayList; // import the ArrayList class


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
		for (Client c : this.clients) {
			if (c.getId().equals(id)) {
				System.out.println("Client numéro " + id + "supprimé.");
				this.clients.remove(c);
			}
		}
		System.out.println("Aucun client avec cet ID.")
	}

	public void modifier(String id) {
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