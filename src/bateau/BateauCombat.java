package bateau;

import jeu.Oc�an;

public class BateauCombat extends Bateau{
	public BateauCombat(Oc�an terrainDeJeu)
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
	public void d�placer()
	{
		
	}
	
}
