public class Client {

	private String idClient;
	private String adresse;
	private String courriel;
	private String telephone;
	private String dateNaissance;
	private String numeroPasseport;
	private String expirationPasseport;

	public Client(String id, String adresse, String courriel, String telephone, String dateNaissance, String numeroPasseport, String expirationPasseport) {
		this.idClient = id;
		this.adresse = adresse;
		this.courriel = courriel;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
		this.numeroPasseport = numeroPasseport;
		this.expirationPasseport = expirationPasseport;

		System.out.println("\n\n\n\nClient ajouté à la base de données !");
		System.out.println("L'ID du nouveau client est : " + this.idClient);
		System.out.println("Veuillez bien conserver cet ID.");
	}

}