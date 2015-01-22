package bateau;

import jeu.Jeu;

public class BateauCombat extends Bateau{
	public BateauCombat(Jeu j)
	{
		super(j);		
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
	public char getTypeDeBateau()
	{
		return 'C';
	}
	
}
