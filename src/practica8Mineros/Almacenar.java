package practica8Mineros;

import java.util.Random;

public class Almacenar {

	public synchronized void almacenarOretirar(String categoria) {
		if (categoria == "M") {
			// si hi han 10 de hierro esperara
			// a que hi hagi espai per contiguan treballant
			while (Mina.almacenHierro == 10) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			Mina.almacenHierro++;
			System.out.println("Hierro anadido! Hierro = " + Mina.almacenHierro);
			notifyAll();
		} else if (categoria == "H") {
			// si hi han 10 de Herramienta o no hi ha 2 de hierro esperara
			// a que hi hagi espai per contiguan treballant
			while (Mina.almacenHerramientas == 10 || Mina.almacenHierro < 2) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			Mina.almacenHerramientas++;
			Mina.almacenHierro = Mina.almacenHierro - 2;
			System.out.println("Herramienta anadida! Herramienta = " + Mina.almacenHerramientas);
			notifyAll();
		} else if (categoria == "T") {
			// si no hi han 5 o mes de Herramienta esperara
			// a que hi hagin per contiguan treballant
			while (Mina.almacenHerramientas < 5) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			Mina.almacenHerramientas = Mina.almacenHerramientas - 5;
			System.out.println("Tren cargado! Herramienta = " + Mina.almacenHerramientas);
			notifyAll();
		}
		System.out.println("Almacen de Hierro = "+Mina.almacenHierro);
		System.out.println("Almacen de Herramientas = "+Mina.almacenHerramientas);
	}
}
