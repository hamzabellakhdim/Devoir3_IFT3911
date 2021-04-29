public class DescVoyage {

	private String idVoyage;
	private int duree;
	private double prix;
	private String lieuDepart;
	private String lieuArrivee;
	private long depart;
	private long arrivee;

	public DescVoyage(String id, int duree, double prix, String lieuDep, String lieuArr, long dep, long arr){
		this.idVoyage = id;
		this.duree = duree;
		this.prix = prix;
		this.lieuDepart = lieuDep;
		this.lieuDepart = lieuDep;
		this.depart = dep;
		this.arrivee = arr;
	}
}