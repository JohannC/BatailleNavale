package bateau;

import java.util.Random;
import jeu.Jeu;

public abstract class Bateau {
	
	public Bateau(Jeu j)
	{
		this.refSurJeu = j;
		Random r = new Random();
		this.coordX = r.nextInt(j.getLongueur());
		this.coordY = r.nextInt(j.getLargeur());
	}	
	public void perdreDesPointsDeVies()
	{
		
	}
	public int getCoordX()
	{
		return this.coordX;
	}
	public int getCoordY()
	{
		return this.coordY;
	}
	public abstract void jouer();	
	public abstract String toString();
	public abstract void déplacer();
	protected int coordX;
	protected int coordY;	
	protected int résistance;	
	protected Jeu refSurJeu;	

}
