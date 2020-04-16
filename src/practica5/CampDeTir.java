package practica5;

public class CampDeTir {
    public static void main(String[] args) {
    	//afegeix una pistola per sincronizarla amb les carregues i descarregues
        Pistola arma = new Pistola();
        Carregar c = new Carregar(arma, 1);
        Descarregar d = new Descarregar(arma, 1);
        //carrega
        c.start();
        //descarrega
        d.start();
    }
 }

