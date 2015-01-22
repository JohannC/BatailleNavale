package affichage;
import jeu.Jeu;

public class Affichage_CLI {
	public Affichage_CLI()
	{
		this.j = new Jeu(20,20,10,5,2,5);
	}
	public void afficherEnvironnement()
	{
		for(int i = 0; i < j.getLongueur(); i++)
		{
			for(int k = 0; k < j.getLargeur(); k++)
			{
				if(j.bateauPrésentALaCase(i, k))
					System.out.print(j.toStringBateauALaCase(i, k)+" ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
		System.out.println("Bateaux en jeu : "+j.getNbBateauEnJeu());
		System.out.println("Bateau Combatant : F | Bateau Hopital : H | Bateay Cible : T");
		j.test();
	}
	private Jeu j;
}
