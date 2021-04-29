public class CRUD_Client extends ClientController {
	ClientGestion gestionnaire;

	public CRUD_Client() {
		this.gestionnaire = new ClientGestion();
	}

	public void ajouterClient(String adresse, String courriel, String tel, String dateNaissance, String numPasseport, String expPasseport) {
		this.gestionnaire.ajouter(adresse, courriel, tel, dateNaissance, numPasseport, expPasseport);
	}

	public void supprimerClient(String id) {
		this.gestionnaire.supprimer(id);
	}

	public void modifierClient(String id) {
		this.gestionnaire.modifier(id);
	}

}