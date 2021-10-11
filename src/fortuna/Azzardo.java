package fortuna;

import java.util.Random;

public abstract class Azzardo {
	
	int risultato;
	Random random = new Random();
	
	public abstract void lancio();

	public long getRisultato() {
		return risultato;
	}
	
	public String toString() {
		return String.valueOf(getRisultato());
	}
}
