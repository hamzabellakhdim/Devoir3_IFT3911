public interface Sujet {

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

	void notify();

}