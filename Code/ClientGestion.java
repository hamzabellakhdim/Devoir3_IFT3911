import java.util.Random;

public class ClientGestion implements Gestionnaire {


	public ClientGestion() {
		ModifClient observateur = new ModifClient();
		attach(observateur);
	}

	public Client ajouter(String adresse, String courriel, String tel, String dateNaissance, String numPasseport, String expPasseport) {
		//génération d'un id
		Random r = new Random();
		int low = 10;
		int high = 100000;
		int result = r.nextInt(high-low) + low;
		String id = Integer.toString(result);

		return new Client(id, adresse, courriel, tel , dateNaissance, numPasseport, expPasseport);
	}

	public void supprimer(String id) {
		
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