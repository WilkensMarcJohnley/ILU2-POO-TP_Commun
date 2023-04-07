package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numtable;

	public ReservationRestaurant(int jour, int mois,int numService, int numtable) {
		super(jour,mois);
		this.numService = numService;
		this.numtable = numtable;
	}

	@Override
	public String toString() {
		if (numService==1) {
			return "Le "+super.jour+"/"+super.mois+" : table n°"+numtable+" pour le premier service.\n";
		}
		return "Le "+super.jour+"/"+super.mois+" : table n°"+numtable+" pour le deuxieme service.\n";
	}
	
	
	
	
}
