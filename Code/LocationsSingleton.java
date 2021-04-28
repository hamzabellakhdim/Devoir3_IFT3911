public class LocationsSingleton {

	private AeroportFactory aeroportFactory;
	private GareFactory gareFactory;
	private PortFactory portFactory;
	private Object key;

	public void Controller() {
		// TODO - implement LocationsSingleton.Controller
		throw new UnsupportedOperationException();
	}

	public AeroportFactory getAeroportFactory() {
		return this.aeroportFactory;
	}

	public GareFactory getGareFactory() {
		return this.gareFactory;
	}

	public PortFactory getPortFactory() {
		return this.portFactory;
	}

}