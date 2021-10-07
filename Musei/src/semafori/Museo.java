//Claut Valentino 5Bia - 08/10/2021
package semafori;

public class Museo 
{
	private int persone_totali;
	private int persone_dentro;
	private int persone_fuori;
	
	public Museo(int persone_totali)
	{
		this.persone_totali = persone_totali;
		this.persone_fuori = persone_totali;
		this.persone_dentro = 0;
	}
	
	public void entra()
	{
		if(this.persone_fuori>0)
		{
			this.persone_fuori--;
			this.persone_dentro++;
		}
	}
	
	public void esce()
	{
		if(this.persone_dentro>0)
		{
			this.persone_dentro--;
			this.persone_fuori++;
		}
	}
	
	public int getPersone_totali()
	{
		return persone_totali;
	}
	public int getPersone_dentro()
	{
		return persone_dentro;
	}
	public int getPersone_fuori()
	{
		return persone_fuori;
	}
}
