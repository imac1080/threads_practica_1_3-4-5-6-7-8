package practica8Mineros;

import java.util.Random;

public class Herrero extends Thread {
	private Almacenar almacenarOrden;

	public Herrero(Almacenar almacenarOrden) {
		this.almacenarOrden = almacenarOrden;
	}

	public void run() {
		while (true) {
			// categoria H de herrero
			// afegeix 1 herramienta i resta 2 hierro
			// entre intervals de 200-2000ms
			Random rand = new Random();
			int numero = rand.nextInt(2001) + 200;
			try {
				Thread.sleep(numero);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			almacenarOrden.almacenarOretirar("H");
		}
	}
}
