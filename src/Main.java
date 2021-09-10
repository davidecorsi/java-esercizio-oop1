/*
 * Scrivere un applicazione che che simuli il lancio di una moneta e di un dado. Per la moneta si assume che
 * 0=testa, 1=croce. 
 * Utilizzare il metodo https://devdocs.io/openjdk~11/java.base/java/util/random#nextInt(int) per generare
 * un numero casuale.
 */

import fortuna.Azzardo;
import fortuna.Dado;
import fortuna.Moneta;

public class Main {
	public static void main(String[] args) {
	     Azzardo dado = new Dado();
	     Azzardo moneta = new Moneta();
	     dado.lancio();
	     moneta.lancio();
	     System.out.println(dado);
	     System.out.println(moneta);
	}
}
