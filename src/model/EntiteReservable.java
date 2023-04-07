package model;

public abstract class EntiteReservable < T extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private int numero;
	
	public EntiteReservable(CalendrierAnnuel calendrier, int numero) {
		super();
		this.calendrier = calendrier;
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int num) {
		this.numero = num;
	}
	
	public boolean estLibre(T formulaire) {
		int jour=formulaire.getJour();
		int mois=formulaire.getMois();
		
		return calendrier.estLibre(jour,mois);
	}
	
	public abstract boolean compatible(T formulaire);
	
	public abstract Reservation reserver(T formulaire);
}
