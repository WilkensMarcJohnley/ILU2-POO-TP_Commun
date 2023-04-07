package model;

public class CentraleReservation<E extends EntiteReservable<F>, F extends Formulaire> {
	private E[] tabEntite;
	private int nbEntite;
	
	
	public CentraleReservation(E[] tabEntite) {
		this.tabEntite = tabEntite;
		this.nbEntite = 0;
	}

	public int ajouterEntite(E entite) {
		tabEntite[nbEntite]=entite;
		nbEntite++;
		return (nbEntite);
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] tabPossibilite= new int[tabEntite.length];
		for (int i = 0; i < tabEntite.length; i++) {
			if (tabEntite[i].compatible(formulaire)) {
				tabPossibilite[i]=i+1;
			}else {
				tabPossibilite[i]=0;
			}
		}
		return tabPossibilite;
	}
	
	public Reservation reserver(int numEntite, F formulaire) {
		int[] possibilite=donnerPossibilites(formulaire);
		if(possibilite!=null) {
			int i;
			for (i = 0; i < possibilite.length && possibilite[i]!=numEntite; ++i);
			formulaire.setIdentificationEntite(i);
			return tabEntite[i-1].reserver(formulaire);
			
		}
		return null;
	}
	
}
