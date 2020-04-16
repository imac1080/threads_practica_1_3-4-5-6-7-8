package practica8Mineros;

public class Mina {
	// creamos las variables de almacenes
	public static int almacenHierro = 0;
	public static int almacenHerramientas = 0;

	public static void main(String[] args) {
		// afegeix una la ordre sincronizada per emmagatzemar amb les diferents
		// categories de minero/herrero/tren
		Almacenar almacenarOretirar = new Almacenar();
		// creem els 3 miners
		Minero m1 = new Minero(almacenarOretirar);
		Minero m2 = new Minero(almacenarOretirar);
		Herrero h1 = new Herrero(almacenarOretirar);
		Tren t1 = new Tren(almacenarOretirar);
		// executem els tres miners
		m1.start();
    	m2.start();
		h1.start();
		t1.start();
	}
}
