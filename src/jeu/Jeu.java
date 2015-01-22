package jeu;
import java.util.ArrayList;
import bateau.Bateau;
import bateau.BateauCible;
import bateau.BateauCombat;
import bateau.BateauHopital;


public class Jeu {
	public Jeu(int longueur, int largeur, int tourMax, int nbBateauCombatant, int nbBateauHopital, int nbBateauCible)
	{
		this.longueur = longueur;
		this.largeur = largeur;		
		this.nbTourMax = tourMax;	
		this.nbBateauCombatant = nbBateauCombatant;
		this.nbBateauCible = nbBateauCible;
		this.nbBateauHopital = nbBateauHopital;
		this.listeDeBateau = new ArrayList<Bateau>();
		for(int i = 0; i < this.nbBateauCombatant; i++)
		{
			this.listeDeBateau.add(new BateauCombat(this));
		}
		for(int i = 0; i < this.nbBateauHopital; i++)
		{
			this.listeDeBateau.add(new BateauHopital(this));
		}
		for(int i = 0; i < this.nbBateauCible; i++)
		{
			this.listeDeBateau.add(new BateauCible(this));
		}
	}	

	public int getLongueur()
	{
		return this.longueur;
	}
	public int getLargeur()
	{
		return this.largeur;
	}
	public int[]getCoordBateau(int index)
	{
		if(index > listeDeBateau.size())
			throw new RuntimeException("index > listeDeBateau.size()");
		else
		{
			int[] coordBateau = new int[2];
			coordBateau[0] = this.listeDeBateau.get(index).coordY();
			coordBateau[1] = this.listeDeBateau.get(index).coordX();
			return coordBateau;
		}						
	}
	public int[][]getCoordToutBateau()
	{
		int[][] coordToutBateau = new int[listeDeBateau.size()][];
		for(int i =0 ; i < listeDeBateau.size();
				i++)
			coordToutBateau[i] = getCoordBateau(i);
		return coordToutBateau;
	}
	public int getNbBateauEnJeu()
	{
		return this.listeDeBateau.size();
	}
	public char getTypeDeBateauALaCoord(int y, int x)
	{
		for(int i = 0; i < listeDeBateau.size(); i++)
		{
			if(listeDeBateau.get(i).coordY() == y && listeDeBateau.get(i).coordX() == x)
				return listeDeBateau.get(i).getTypeDeBateau();
		}
		return 'B';
	}
	private int nbTourMax;	
	private int longueur;
	private int largeur;
	private ArrayList<Bateau> listeDeBateau;
	private int nbBateauCombatant;
	private int nbBateauHopital;
	private int nbBateauCible ;
}
