public abstract interface Gestionnaire {

	Object ajouter();

	void modifier(Object o);

	void supprimer(Object o);

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