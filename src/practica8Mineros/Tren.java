package practica8Mineros;

import java.util.Random;

public class Tren extends Thread {
	private Almacenar almacenarOrden;

	public Tren(Almacenar almacenarOrden) {
		this.almacenarOrden = almacenarOrden;
	}
	public void run() {
		while (true) {
			// categoria T de tren
			// si no, treu 5 de Herramienta
			// entre intervals de 500-5000ms
			Random rand = new Random();
			int numero = rand.nextInt(5001) + 500;
			try {
				Thread.sleep(numero);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			almacenarOrden.almacenarOretirar("T");
		}
	}
}
