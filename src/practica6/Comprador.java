package practica6;

import java.util.Random;

public class Comprador extends Thread {
    private Vendas comprar;
    private int entradas;

    public Comprador(Vendas comprar) {
        this.comprar = comprar;
    }

    public void run() {
    	//numero aleatori de entrades entre 1 i 5 
    	 Random rand = new Random();     	  
         int entradas = rand.nextInt(5) + 1;
        for (int i = 0; i < entradas; i++) {
        	comprar.comprar();
        }
    }
}
