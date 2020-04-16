package practica5;

public class Carregar extends Thread {
    private Pistola arma;
    private int cartucho;

    public Carregar(Pistola arma, int cartucho) {
        this.arma = arma;
        this.cartucho = cartucho;
    }

    public void run() {
    	//cridara apuntar() deu cops alternant amb disparar(), enviant el cartucho i bala 
    	//com indicador
        for (int i = 0; i < 10; i++) {
            arma.apuntar();
            System.out.println("Apuntar #" + this.cartucho
                               + " bala: " + i);
        }
    }
}
