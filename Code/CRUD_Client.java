public class CRUD_Client extends ClientController {

	public void ajouterClient(String adresse, String courriel, String tel) {
		ClientGestion gestionnaire = new ClientGestion();

		gestionnaire.ajouter(adresse, courriel, tel);
	}

	public void supprimerClient(String id) {
		ClientGestion gestionnaire = new ClientGestion();

		gestionnaire.modifier(id);
	}

	public void modifierClient(String id) {
		ClientGestion gestionnaire = new ClientGestion();

		gestionnaire.supprimer(id);
	}

}