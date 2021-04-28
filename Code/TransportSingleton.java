public class TransportSingleton {

	private AvionFactory avionFactory;
	private PaquebotFactory paquebotFactory;
	private TrainFactory trainFactory;
	private Object key;

	public AvionFactory getAvionFactory() {
		return this.avionFactory;
	}

	public void setAvionFactory(AvionFactory avionFactory) {
		this.avionFactory = avionFactory;
	}

	public TrainFactory getTrainFactory() {
		return this.trainFactory;
	}

	public void Controller() {
		// TODO - implement TransportSingleton.Controller
		throw new UnsupportedOperationException();
	}

}