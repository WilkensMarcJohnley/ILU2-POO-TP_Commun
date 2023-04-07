package model;

public class Restaurant {
	private CentraleReservation centrale;
	
	private static class Table extends EntiteReservable{
		private CalendrierAnnuel[] calendrierDeuxiemeService=new CalendrierAnnuel[2];
		private int nbChaises;
		
		public Table(CalendrierAnnuel calendrier, int numero, int nbChaises) {
			super(calendrier, numero);
			this.nbChaises = nbChaises;
		}
		
		public boolean compatible(FormulaireRestaurant formulaire) {
			
			
			return false;
		}
		
	}

	public void ajouterTable(int i) {
		
		
	}

	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return centrale.donnerPossibilites(formulaire);
	}

	public ReservationRestaurant reserver(int numEntite, FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return centrale.reserver(numEntite,formulaire);
	}
}