public abstract interface Gestionnaire {

	Object ajouter();

	Object modifier();

	Object supprimer();

	void notify();

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