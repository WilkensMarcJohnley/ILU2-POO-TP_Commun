package model;

public class Restaurant {
	private CentraleReservation centrale;
	//faire un new
	private Table table;
	
		
	private static class Table extends EntiteReservable<FormulaireRestaurant>{
		private CalendrierAnnuel[] calendrierDeuxiemeService=new CalendrierAnnuel[2];
		private int nbChaises;

		private Table(CalendrierAnnuel calendrier, int numero, int nbChaises) {
			super(calendrier, numero);
			this.nbChaises = nbChaises;
		}
		
		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			int nbPersonnes=formulaire.getNombrePersonnes();
			return (nbChaises==nbPersonnes || nbChaises-nbPersonnes==1) && estLibre(formulaire);
		}

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			int numservice=formulaire.getNumService();
			int numTable=getNumero();
			if (compatible(formulaire)) {
				int jour,mois;
				jour=formulaire.getJour();
				mois=formulaire.getMois();
				if(calendrierDeuxiemeService[numservice].reserver(jour, mois)) {
					Reservation reservation= new ReservationRestaurant(jour, mois, numservice, numTable);
					return reservation;
				}
			}
			
			return null;
		}


		
	}

	public void ajouterTable(int i) {
		
		
	}

	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return centrale.donnerPossibilites(formulaire);
	}

	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return centrale.reserver(numEntite, formulaire);
	}
	
}