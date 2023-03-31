package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];

	public CalendrierAnnuel() {
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Février", 28);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Aout", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Décembre", 31);

	}

	public boolean estLibre(int jour, int mois) {
		// TODO Auto-generated method stub
		return (calendrier[mois - 1]).estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		// TODO Auto-generated method stub
		if (estLibre(jour, mois)) {
			(calendrier[mois - 1]).reserver(jour);
			return true;
		}
		return false;
	}

	private static class Mois {

		private String nom;
		private int nb_jours;
		private boolean[] jour;

		public Mois(String nom, int nb_jours) {
			this.nom = nom;
			this.nb_jours = nb_jours;
			jour = new boolean[nb_jours];
		}

		private boolean estLibre(int jourChoisi) {
			return !jour[jourChoisi - 1];
		}

		public void reserver(int jourChoisi) {
			jour[jourChoisi - 1] = true;
		}

	}

}
