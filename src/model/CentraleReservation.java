package model;

public class CentraleReservation<T> {
	private T[] tabEntite;
	private int nbEntite;
	
	public CentraleReservation(T[] tabEntite) {
		this.tabEntite = tabEntite;
		this.nbEntite = tabEntite.length;
	}
	
	public int ajouterEntite(T entite) {
		tabEntite[nbEntite]=entite;
		nbEntite++;
		return (nbEntite-1);
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		int[] tabPossibilite= new int[tabEntite.length];
		for (int i = 0; i < tabEntite.length; i++) {
			if (((EntiteReservable) tabEntite[i]).compatible(formulaire)) {
				tabPossibilite[i]=((EntiteReservable) tabEntite[i]).getNumero();
			}else {
				tabPossibilite[i]=0;
			}
		}
		return tabPossibilite;
	}
	
	public ReservationRestaurant reserver(int numEntite, FormulaireRestaurant formulaire) {
		int[] possibilite=donnerPossibilites(formulaire);
		int num=0;
		for (int i = 0; i < possibilite.length; i++) {
			if(possibilite[i]==numEntite) {
				num=possibilite[i];
			}
		}
		
		formulaire.setIdentificationEntite(num);
		return ((EntiteReservable) tabEntite[num-1]).reserver(formulaire);
		
	}
	
}
