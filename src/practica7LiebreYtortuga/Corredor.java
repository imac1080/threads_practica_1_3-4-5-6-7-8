package practica7LiebreYtortuga;

import java.util.Random;

public class Corredor extends Thread {
	private String animal;

	public Corredor(String animal) {
		this.animal = animal;
	}

	public void run() {
		while (Cursa.casillasT < 70 && Cursa.casillasL < 70) {
			//ponemos un sleep de un segundo
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// numero aleatori de entrades entre 1 i 100 per calcular el percentatge
			Random rand = new Random();
			int numero = rand.nextInt(101);
			// si el animal es tortuga seguira les pautes de cursa de aquesta
			if (animal == "T") {
				if (numero <= 50) {
					Cursa.casillasT = Cursa.casillasT + 3;
					System.out.println("Avance rapido T = casilla " + Cursa.casillasT);
				} else if (numero <= 70) {
					Cursa.casillasT = Cursa.casillasT - 6;
					// no pot arribar per sota de 0
					if (Cursa.casillasT < 0) {
						Cursa.casillasT = 0;
					}
					System.out.println("Resbalon T = casilla " + Cursa.casillasT);
				} else {
					Cursa.casillasT = Cursa.casillasT + 1;
					System.out.println("Avance lento T = casilla " + Cursa.casillasT);
				}
				// en canvi si el animal es liebre seguira les pautes de cursa de aquesta
			} else if (animal == "L") {
				if (numero <= 20) {
					System.out.println("No se mueve L = casilla " + Cursa.casillasL);
				} else if (numero <= 40) {
					Cursa.casillasL = Cursa.casillasL + 20;
					System.out.println("Gran salto L = casilla " + Cursa.casillasL);
				} else if (numero <= 50) {
					Cursa.casillasL = Cursa.casillasL - 12;
					// no pot arribar per sota de 0
					if (Cursa.casillasL < 0) {
						Cursa.casillasL = 0;
					}
					System.out.println("Reesbalon grande L = casilla " + Cursa.casillasL);
				} else if (numero <= 80) {
					Cursa.casillasL = Cursa.casillasL + 1;
					System.out.println("Pequeno sato L = casilla " + Cursa.casillasL);
				} else {
					Cursa.casillasL = Cursa.casillasL - 2;
					// no pot arribar per sota de 0
					if (Cursa.casillasL < 0) {
						Cursa.casillasL = 0;
					}
					System.out.println("Reesbalon pequeno L = casilla " + Cursa.casillasL);
				}
			}
		}
		//damos el resultado en caso de que no se haya dado ya en otro thread
		if (!Cursa.ResultadoDado) {
			Cursa.ResultadoDado=true;
			if (Cursa.casillasT >= 70 && Cursa.casillasL >= 70) {
				System.out.println("EMPATE || L = " + Cursa.casillasL + " || T = " + Cursa.casillasT);
			} else if (Cursa.casillasT >= 70) {
				System.out.println("GANA || T = " + Cursa.casillasT);
			} else if (Cursa.casillasL >= 70) {
				System.out.println("GANA || L = " + Cursa.casillasL);
			}
		}

	}
}
