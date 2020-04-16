package practica5;

public class Pistola {
    private int cartucho;
    //crea bolea per saber si disparar o carregar
    private boolean enposicio = true;

    public synchronized void disparar(int cartucho) {
    	//si esta en posicio disparara
        while (enposicio == false) {
            try {
                // Esperar a apuntar
                wait();
            } catch (InterruptedException e) { }
        }
        enposicio = false;
        notifyAll();
    }
 
    public synchronized void apuntar() {
    	//si no esta en posicio apuntara
        while (enposicio == true) {
            try {
                // Esperar a disparar
                wait();
            } catch (InterruptedException e) { }
        }
        enposicio = true;
        notifyAll();
    }

}

