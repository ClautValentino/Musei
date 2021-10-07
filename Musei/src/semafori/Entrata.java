//Claut Valentino 5Bia - 08/10/2021
package semafori;
import java.util.Random;

public class Entrata implements Runnable 
{
	private boolean tCheck = false;
	private int min_attesa;
	private int max_attesa;
	private Museo m;
	
	public Entrata(int min_attesa, int max_attesa, Museo m)
	{
		this.min_attesa = min_attesa;
		this.max_attesa = max_attesa;
		this.m = m;
	}
	
	@Override
	public void run() 
	{
		Random r = new Random();
		int attesa;
		this.tCheck = true;
		
		while(this.tCheck == true)
		{
			if(m.getPersone_dentro()<4)
			{
				m.entra();
				attesa = r.nextInt((max_attesa - min_attesa) + 1) + min_attesa;
				try {
					Thread.sleep(attesa*100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void stop()
	{
		this.tCheck = false;
	}
}
