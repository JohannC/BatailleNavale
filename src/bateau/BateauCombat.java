package bateau;

import jeu.Jeu;

public class BateauCombat extends Bateau{
	public BateauCombat(Jeu j)
	{
		super(j);		
	}
	public void jouer()
	{
		this.déplacer();
	}
	private void tirer()
	{
		
	}
	public void dÃ©placer()
	{
		int[] coordCibleLaPlusProche = this.refSurJeu.getCoordCiblePlusProcheDe(this);
	}
	public String toString()
	{
		return "F";
	}
	private static final int résistanceMax = 5;
}
