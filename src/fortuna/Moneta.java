package fortuna;

public class Moneta extends Azzardo {
	
	public Moneta() {
		risultato = 0;
	}
	
	public void lancio() {
		risultato = random.nextInt(2);
	}
}
