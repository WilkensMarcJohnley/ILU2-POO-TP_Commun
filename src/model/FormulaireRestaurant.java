package model;

public class FormulaireRestaurant extends Formulaire {
	private int nombrePersonnes;
	private int numService;
	private int identificationEntite;
	
	public int getIdentificationEntite() {
		return identificationEntite;
	}

	public void setIdentificationEntite(int num) {
		this.identificationEntite = num;
	}

	public FormulaireRestaurant(int jour, int mois, int nombrePersonnes, int numService) {
		super(jour, mois);
		this.nombrePersonnes= nombrePersonnes;
		this.numService = numService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numService;
	}

	
	
	
}
