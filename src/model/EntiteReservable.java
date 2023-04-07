package model;

public class EntiteReservable {
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
	
	public boolean estLibre(FormulaireRestaurant formulaire) {
		int jour=formulaire.getJour();
		int mois=formulaire.getMois();
		
		return calendrier.estLibre(jour,mois);
	}
	
	public boolean compatible(FormulaireRestaurant formulaire) {
		return formulaire.getIdentificationEntite()==numero;
	}
	
	public ReservationRestaurant reserver(FormulaireRestaurant formulaire) {
		if (compatible(formulaire)) {
			int jour=formulaire.getJour();
			int mois=formulaire.getMois();
			int nbPersonnes=formulaire.getNombrePersonnes();
			int numService= formulaire.getNumService();
			
			ReservationRestaurant reservation= new ReservationRestaurant(jour,mois,numService,nbPersonnes);
			return reservation;
			
		}
		return null;
	}
	
	
	
}
