package practica3;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		SelfRun objActivo = new SelfRun();
		Scanner lector = new Scanner(System.in);
		//creo el proceso
		lector.next();
		// Termina el objeto activo
		System.out.println("main invoca stopRequest()");
		objActivo.stopRequest();
	}
	

}
