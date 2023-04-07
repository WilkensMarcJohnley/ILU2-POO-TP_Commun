package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int identificationEntite;
	
	public Formulaire(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getIdentificationEntite() {
		return identificationEntite;
	}
	
	public void setIdentificationEntite(int num) {
		this.identificationEntite = num;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	
}
	

