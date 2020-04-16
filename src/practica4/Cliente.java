package practica4;

public class Cliente extends Thread {
	public void run() {
		for (int i = 0; i < 5000; i++) {
			//lama al metodo 5000veces
			Recurso.uso();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		;
	};
}
