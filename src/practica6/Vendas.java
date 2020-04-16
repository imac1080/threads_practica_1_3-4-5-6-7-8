package practica6;

import java.util.Random;

public class Vendas {

	public synchronized void comprar() {
		//loop fins que la entrada no estigui ja comprada
		boolean compraValida = false;
		while (!compraValida) {
			// fem sleep de un segon per simular que l’usuari s’ho esta rumiant.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Random rand = new Random();
			int entrada = rand.nextInt(CampDeVendas.vector.length);
			// si la entrada ja esta venuda no es fa res
			if (CampDeVendas.vector[entrada] == 0) {
				CampDeVendas.vector[entrada] = CampDeVendas.vector[entrada] + 1;
				compraValida=true;
			}
		}
	}
}
