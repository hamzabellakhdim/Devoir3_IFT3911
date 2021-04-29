public abstract class Voyage {

	protected String idSiege;
	protected String idSection;
	protected String idmoyenTransport;
	protected boolean etatVoyage;
	protected DescVoyage descVoyage;


	public Voyage(String idSiege, String idSection, String idmoyenTrans, boolean etat, String id, int duree, double prix, String lieuDep, String lieuArr, long dep, long arr){
		DescVoyage desc = new DescVoyage(id, duree, prix, lieuDep, lieuArr, dep, arr);
		this.descVoyage = desc;
		this.idSiege = idSiege;
		this.idSection = idSection;
		this.idmoyenTransport = idmoyenTrans;
		this.etatVoyage = etat;
	}
	/**
	 * 
	 * @param v
	 */
	public void accept(VisitVoyages v) {
		// TODO - implement Voyage.accept
		displayInfos();
	}

	public void displayInfos() {
		// TODO - implement Voyage.displayInfos
		String info = "";

	}

}