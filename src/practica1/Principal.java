package practica1;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i < 6; i++) {
			HolaMundo t1 = new HolaMundo(i);
			t1.start();
			//t1.join();
//Creamos los cinco threads uno detr�s de otro esperando que se cierre utilizando el join.
		}
	}
}
