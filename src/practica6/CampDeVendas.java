package practica6;

public class CampDeVendas {	
	public static int[] vector;
    public static void main(String[] args) throws InterruptedException {
    	//crea el vector y posa a 0
    	vector = new int[100];
    	for (int i = 0; i < vector.length; i++) {
			vector[i]=0;
		}
    	//creem el sistema de venda synchronized
    	Vendas arma = new Vendas();
    	//creem els deu compradors
    	Comprador c1 = new Comprador(arma);
    	Comprador c2 = new Comprador(arma);
    	Comprador c3 = new Comprador(arma);
    	Comprador c4 = new Comprador(arma);
    	Comprador c5 = new Comprador(arma);
    	Comprador c6 = new Comprador(arma);
    	Comprador c7 = new Comprador(arma);
    	Comprador c8 = new Comprador(arma);
    	Comprador c9 = new Comprador(arma);
    	Comprador c10 = new Comprador(arma);
    	//iniciem els compradors
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        //recullim els clients
        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();
        c6.join();
        c7.join();
        c8.join();
        c9.join();
        c10.join();
        
        //contar quants estan a 0,1 i 2
        int contador0 =0;
        int contador1 =0;
        int contador2 =0;
        for (int i = 0; i < vector.length; i++) {
			if (vector[i]==0) {
				contador0++;
			}else if (vector[i]==1) {
				contador1++;
			}else if (vector[i]==2) {
				contador2++;
			}
		}
        System.out.println("Entradas a 0 = "+contador0);
        System.out.println("Entradas a 1 = "+contador1);
        System.out.println("Entradas a 2 = "+contador2);
    }
 }

