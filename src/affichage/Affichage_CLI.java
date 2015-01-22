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
				if(bateauPrésentSurLaCase(i, k))
					System.out.print(j.getTypeDeBateauALaCoord(i, k)+" ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
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
	}
	private Jeu j;
}
