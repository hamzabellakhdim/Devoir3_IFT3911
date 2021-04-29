import java.util.Date;

public abstract class Reservation {

	protected String idReservation;
	protected Date dateDepart;
	protected Date dateRetour;
	protected String idClient;
	protected boolean isConfirmed;

	public boolean estconfirmee() {
		// TODO - implement Reservation.estconfirmee
		throw new UnsupportedOperationException();
	}

	public double getTotal() {
		// TODO - implement Reservation.getTotal
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param montant
	 */
	public Paiement creerPaiement(double montant) {
		// TODO - implement Reservation.creerPaiement
		throw new UnsupportedOperationException();
	}

	public void reserver() {
		// TODO - implement Reservation.reserver
		throw new UnsupportedOperationException();
	}

}