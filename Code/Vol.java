public class Vol extends Voyage {

	public Vol(String idSiege, String idSection, String idmoyenTrans, boolean etat, String id, int duree, double prix, String lieuDep, String lieuArr, long dep, long arr){
		super(idSiege, idSection, idmoyenTrans, etat, id, duree, prix, lieuDep, lieuArr, dep, arr);
	}

	


	/**
	 * 
	 * @param v
	 */
	public void accept(VisitVoyages v) {
		// TODO - implement Vol.accept
		throw new UnsupportedOperationException();
	}

	public void displayInfos() {
		// TODO - implement Vol.displayInfos
		throw new UnsupportedOperationException();
	}

}