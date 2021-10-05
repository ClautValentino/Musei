package semafori;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) 
	{
		Semaphore visitatore = new Semaphore(4);
		String posti[]=new String[4];
		
		Scanner s = new Scanner(System.in);
		System.out.println("inserire tempo minimo: ");
		int tmin = s.nextInt();
		System.out.println("inserire tempo massimo: ");
		int tmax = s.nextInt();
		
		System.out.println("inserire intervallo di tempo minimo tra l'arrivo di un visitatore e del successivo: ");
		int deltamin = s.nextInt();
		System.out.println("inserire intervallo di tempo massimo tra l'arrivo di un visitatore e del successivo: ");
		int deltamax = s.nextInt();
		
		for(int i=0; i<4; i++)
		{
			posti[i] = "libero";
		}
		
		
	}

}
