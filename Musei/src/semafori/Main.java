//Claut Valentino 5Bia - 08/10/2021
package semafori;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		int min_attesa;
		int max_attesa;
		int min_permanenza;
		int max_permanenza;
		Thread threadEntrata = null;
		Thread threadUscita = null;
		String status = "";
		Entrata e = null;
		Uscita u = null;
		Museo m = null;
		
		System.out.println("inserire il tempo di attesa minimo (in secondi): ");
		min_attesa = scanner.nextInt();
		System.out.println("inserire il tempo di attesa massimo (in secondi): ");
		max_attesa = scanner.nextInt();
		System.out.println("inserire intervallo di tempo minimo tra l'arrivo di un visitatore e del successivo (in secondi): ");
		min_permanenza = scanner.nextInt();
		System.out.println("inserire intervallo di tempo massimo tra l'arrivo di un visitatore e del successivo (in secondi): ");
		max_permanenza = scanner.nextInt();
		
		m = new Museo(10);
		e = new Entrata(min_attesa, max_attesa, m);
		u = new Uscita(min_permanenza, max_permanenza, m);
		threadEntrata = new Thread(e);
		threadUscita = new Thread(u);
		
		threadEntrata.start();
		threadUscita.start();
		
		while(!status.equals("STOP"))
		{
			System.out.println("Scrivere la parola STATUS per ottenere le informazioni riguardo il museo: ");
			status = scanner.nextLine();
			if(status.equals("STATUS"))
			{
				System.out.println("Persone totali: " + m.getPersone_totali());
				System.out.println("Numero di persone dentro: " + m.getPersone_dentro());
				System.out.println("Numero di persone fuori: " + m.getPersone_fuori());
			}
			else
			{
				System.out.println(status + " non è un comando valido. Inserire il comando STATUS.");
			}
		}
		
		e.stop();
		u.stop();
	}
}
