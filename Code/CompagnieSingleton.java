public class CompagnieSingleton {

	private CompagnieAerienneFactory aerialFactory;
	private CompagnieNavaleFactory navalFactory;
	private CompagnieFerroviaireFactory trainCFactory;
	private Object key;

	public void Controller() {
		// TODO - implement CompagnieSingleton.Controller
		throw new UnsupportedOperationException();
	}

	public CompagnieAerienneFactory getAerialFactory() {
		return this.aerialFactory;
	}

	public CompagnieNavaleFactory getNavalFactory() {
		return this.navalFactory;
	}

	public CompagnieFerroviaireFactory getTrainCFactory() {
		return this.trainCFactory;
	}

}