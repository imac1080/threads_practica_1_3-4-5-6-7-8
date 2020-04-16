package practica3;

import java.io.IOException;

public class SelfRun implements Runnable {
	private Thread internalThread;
	private boolean noStopRequired;

	public SelfRun() {
		System.out.println("Comienza ejecución");
		noStopRequired = true;
		internalThread = new Thread(this);
		internalThread.start();
	}

	public void run() {
			System.out.println("ordenando...");
			try {
				//executara tota la estona fins que el usuari escrigui
				Process proceso = Runtime.getRuntime().exec("cmd /c sort lista.txt > orden.txt");
			} catch (IOException e) {
				e.printStackTrace();

			}
		
	}

	public void stopRequest() {
		noStopRequired = false;
		internalThread.interrupt();
	}
}