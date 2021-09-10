package fortuna;

public class Dado extends Azzardo {
	
	public Dado() {
		risultato = 1;
	}
		
	public void lancio() {
		risultato = random.nextInt(6) + 1;
	}
}
