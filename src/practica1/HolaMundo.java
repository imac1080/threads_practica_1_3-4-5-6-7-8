package practica1;

public class HolaMundo extends Thread {
	private int hilo; // Tiempo entre escrituras

	public HolaMundo(int hilo) {
		this.hilo = hilo;
	};

	public void run() { // Se sobrescribe run() de Thread
		while (true) {
			System.out.println("hola mundo "+hilo+", estamos en el hilo "+hilo);
			//imprimimos la sentencia
			return;
		}
	}
}
