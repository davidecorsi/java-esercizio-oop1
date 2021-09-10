package fortuna;

import java.util.Random;

public abstract class Azzardo {
	
	protected int risultato;
	protected Random random = new Random();
	
	public abstract void lancio();

	public long getRisultato() {
		return risultato;
	}
	
	public String toString() {
		return String.valueOf(getRisultato());
	}
}
