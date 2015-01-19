package bateau;

import java.util.Random;
import jeu.Oc�an;

public abstract class Bateau {
	
	public Bateau(Oc�an terrainDeJeu)
	{
		this.refTerrainDeJeu = terrainDeJeu;
		Random r = new Random();
		this.coordX = r.nextInt(terrainDeJeu.getLongueur());
		this.coordY = r.nextInt(terrainDeJeu.getLargeur());
	}	
	public void perdreDesPointsDeVies()
	{
		
	}
	abstract void jouer();	
	protected int coordX;
	protected int coordY;	
	protected int r�sistance;	
	protected Oc�an refTerrainDeJeu;	
}
