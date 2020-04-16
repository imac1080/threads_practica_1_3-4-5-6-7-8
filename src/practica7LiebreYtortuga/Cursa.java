package practica7LiebreYtortuga;

public class Cursa {
	//creamos boleano para no repetir el resultado encada thread
	public static boolean ResultadoDado =false;
	// crea les caselles per la llebre y la tortuga
		public static	int casillasT=0;
		public static	int casillasL=0;
	public static void main(String[] args) throws InterruptedException {
		// creem els corredors
		Corredor c1 = new Corredor("T");
		Corredor c2 = new Corredor("L");
		// iniciem els corredors
		c1.start();
		c2.start();
	}
}
