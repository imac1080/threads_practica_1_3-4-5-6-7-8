package practica8Mineros;

import java.util.Random;

public class Minero extends Thread {
	private Almacenar almacenarOrden;

	public Minero(Almacenar almacenarOrden) {
		this.almacenarOrden = almacenarOrden;
	}

	public void run() {
		while (true) {
			// categoria M de minero
			// recloecta el ferro entre intervals de 100-1000ms
			Random rand = new Random();
			int numero = rand.nextInt(1001) + 100;
			try {
				Thread.sleep(numero);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			almacenarOrden.almacenarOretirar("M");
		}
	}
}
