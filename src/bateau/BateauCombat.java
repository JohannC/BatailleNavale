package bateau;

import jeu.Jeu;

public class BateauCombat extends Bateau{
	public BateauCombat(Jeu j)
	{
		super(j);		
	}
	public void jouer()
	{
		this.d�placer();
	}
	private void tirer()
	{
		
	}
	public void déplacer()
	{
		int[] coordCibleLaPlusProche = this.refSurJeu.getCoordCiblePlusProcheDe(this);
	}
	public String toString()
	{
		return "F";
	}
	private static final int r�sistanceMax = 5;
}
