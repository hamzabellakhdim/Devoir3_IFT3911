public class CompagnieSingleton {

	private CompagnieAerienneFactory aerialFactory = new CompagnieAerienneFactory();
	private CompagnieNavaleFactory navalFactory = new CompagnieNavaleFactory();
	private CompagnieFerroviaireFactory trainCFactory = new CompagnieFerroviaireFactory();
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