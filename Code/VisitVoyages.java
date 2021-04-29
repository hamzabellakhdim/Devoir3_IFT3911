public abstract interface VisitVoyages {

	/**
	 * 
	 * @param v
	 */
	void visitVols(Vol v);

	/**
	 * 
	 * @param t
	 */
	void visitTrajets(V_en_train t);

	/**
	 * 
	 * @param i
	 */
	void visitItineraires(Itineraire i);

}