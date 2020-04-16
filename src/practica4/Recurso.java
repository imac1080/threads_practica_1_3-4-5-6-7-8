package practica4;

public class Recurso {
	//la variable esta portegida por el metodo synchronized
	static synchronized void uso() {
		//Thread t = Thread.currentThread();
		//System.out.println("Soy " + t.getName());
		principal.numero++;
	}
}
