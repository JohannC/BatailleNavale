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
<<<<<<< HEAD
				if(j.bateauPr�sentALaCase(i, k))
					System.out.print(j.toStringBateauALaCase(i, k)+" ");
=======
				if(bateauPrésentSurLaCase(i, k))
					System.out.print(j.getTypeDeBateauALaCoord(i, k)+" ");
>>>>>>> origin/master
				else
					System.out.print("- ");
			}
			System.out.println();
		}
<<<<<<< HEAD
		System.out.println("Bateaux en jeu : "+j.getNbBateauEnJeu());
		System.out.println("Bateau Combatant : F | Bateau Hopital : H | Bateay Cible : T");
		j.test();
=======
	}
	private boolean bateauPrésentSurLaCase(int y, int x)
	{
		int[][] listeCoordBateau = this.j.getCoordToutBateau();
		for(int i=0; i < listeCoordBateau.length; i++)
		{
			if(listeCoordBateau[i][0] == y && listeCoordBateau[i][1] == x)
				return true;
		}
		return false;
>>>>>>> origin/master
	}
	private Jeu j;
}
