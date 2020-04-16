package practica4;

public class principal {
	static int numero = 0;

	public static void main(String[] args) throws InterruptedException {
		Cliente juan = new Cliente();
		Cliente ines = new Cliente();
		Cliente juan2 = new Cliente();
		Cliente ines2 = new Cliente();
		juan.start();
		ines.start();
		juan2.start();
		ines2.start();
		juan.join();
		ines.join();
		juan2.join();
		ines2.join();
		System.out.println(numero);
	}

}
