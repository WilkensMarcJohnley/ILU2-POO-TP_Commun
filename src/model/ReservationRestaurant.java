package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int nbPersonnes;

	public ReservationRestaurant(int jour, int mois,int numService, int nbPersonnes) {
		super(jour,mois);
		this.numService = numService;
		this.nbPersonnes = nbPersonnes;
	}
	
	
	
}
