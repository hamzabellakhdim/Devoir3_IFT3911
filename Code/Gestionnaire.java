public abstract interface Gestionnaire {

	Objet ajouter();

	Objet modifier();

	Objet supprimer();

	void notify_();

	/**
	 * 
	 * @param ModifBase
	 */
	void attach(int ModifBase);

	/**
	 * 
	 * @param ModifBase
	 */
	void detach(int ModifBase);

}