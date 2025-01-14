package garages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stationnement {

	private final Voiture myCar;
	private final Garage myGarage;

	private final Date entree = new Date(); // Aujourd'hui
	private Date fin;

	public Stationnement(Voiture v, Garage g) {
		myCar = v;
		myGarage = g;
	}

	public Voiture getCar() {
		return myCar;
	}

	public Garage getGarage() {
		return myGarage;
	}

	public Date getEntree() {
		return entree;
	}

	public Date getFin() {
		return fin;
	}

	public void stationnementTerminer() {
		// On enregistre la date de fin du stationnement
		fin = new Date(); // Date du jour
	}

	public boolean estEnCours() {
		// Le stationnement est en cours si on ne connait pas la date de fin
		return (fin == null);
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
		return String.format("Stationnement{ entree=%s, %s }",
				dateFormat.format(entree),
				estEnCours() ? "en cours" : "sortie=" + dateFormat.format(fin));
	}

}
