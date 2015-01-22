package affichage;
import jeu.Jeu;

public class Affichage_CLI {
	public Affichage_CLI()
	{
		this.j = new Jeu(20,20,10,4,2,5);
	}
	public void afficherEnvironnement()
	{
		for(int i = 0; i < j.getLongueur(); i++)
		{
			for(int k = 0; k < j.getLargeur(); k++)
			{
<<<<<<< HEAD
<<<<<<< HEAD
				if(j.bateauPrésentALaCase(i, k))
					System.out.print(j.toStringBateauALaCase(i, k)+" ");
=======
				if(bateauPrÃ©sentSurLaCase(i, k))
					System.out.print(j.getTypeDeBateauALaCoord(i, k)+" ");
>>>>>>> origin/master
=======
				if(bateauPrésentSurLaCase(i, k))
					System.out.print(j.getTypeDeBateauALaCoord(i, k)+" ");
>>>>>>> parent of e85546f... V0.0.3
				else
					System.out.print("- ");
			}
			System.out.println();
		}
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println("Bateaux en jeu : "+j.getNbBateauEnJeu());
		System.out.println("Bateau Combatant : F | Bateau Hopital : H | Bateay Cible : T");
		j.test();
=======
	}
	private boolean bateauPrÃ©sentSurLaCase(int y, int x)
=======
	}
	private boolean bateauPrésentSurLaCase(int y, int x)
>>>>>>> parent of e85546f... V0.0.3
	{
		int[][] listeCoordBateau = this.j.getCoordToutBateau();
		for(int i=0; i < listeCoordBateau.length; i++)
		{
			if(listeCoordBateau[i][0] == y && listeCoordBateau[i][1] == x)
				return true;
		}
		return false;
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> parent of e85546f... V0.0.3
	}
	private Jeu j;
}
