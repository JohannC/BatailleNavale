package bateau;

public class Bateau_Généric {
	public Bateau_Généric(int coordY, int coordX)
	{
		this.coordY = coordY;
		this.coordX = coordX;
		id = compteurInstance;
		compteurInstance++;
	}	
	private int coordX;
	private int coordY;
	private int id;
	private static int compteurInstance;	

}
