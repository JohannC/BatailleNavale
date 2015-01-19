package bateau;

import jeu.Océan;

public class BateauCombat extends Bateau{
	public BateauCombat(Océan terrainDeJeu)
	{
		super(terrainDeJeu);		
	}
	public void jouer()
	{
		
	}
	private void tirer(Bateau cible)
	{
		cible.perdreDesPointsDeVies();
	}
	public void déplacer()
	{
		
	}
	
}
