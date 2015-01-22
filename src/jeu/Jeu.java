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
			coordBateau[0] = this.listeDeBateau.get(index).getCoordY();
			coordBateau[1] = this.listeDeBateau.get(index).getCoordX();
			return coordBateau;
		}						
	}
	public int[][]getCoordToutLesBateaux()
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
	public String toStringBateauALaCase(int y, int x)
	{		
		assert(this.bateauPrésentALaCase(y, x));
		int index = 0;
		for(int i = 0; i < listeDeBateau.size(); i++)
		{
			if(listeDeBateau.get(i).getCoordY() == y && listeDeBateau.get(i).getCoordX() == x)
			{
				index = i;
				break;
			}
		}
		return listeDeBateau.get(index).toString();		
	}	
	public boolean bateauPrésentALaCase(int y, int x)
	{
		for(int i = 0 ; i < listeDeBateau.size(); i++)
		{
			if(listeDeBateau.get(i).getCoordY() == y && listeDeBateau.get(i).getCoordX() == x)
			{
				return true;
			}
		}
		return false;
	}
	public int[] getCoordCiblePlusProcheDe(Bateau attaquant)
	{
		int[][] coordToutLesBateaux = this.getCoordToutLesBateaux();
		int[] coordCibleLaPlusProche = new int[2];
		coordCibleLaPlusProche[0] = coordToutLesBateaux[0][0];
		coordCibleLaPlusProche[1] = coordToutLesBateaux[0][1];
		for(int i = 1; i < coordToutLesBateaux.length; i++)
		{
			if((Math.sqrt(Math.pow(coordToutLesBateaux[i][0] - attaquant.getCoordY(), 2) + Math.pow(coordToutLesBateaux[i][1] - attaquant.getCoordX(), 2))) < 
					(Math.sqrt(Math.pow(coordCibleLaPlusProche[0] - attaquant.getCoordY(), 2) + Math.sqrt(Math.pow(coordCibleLaPlusProche[1] - attaquant.getCoordX(), 2))))
					&& (coordToutLesBateaux[i][0] != attaquant.getCoordY() && coordToutLesBateaux[i][1] != attaquant.getCoordX()))
			{
				coordCibleLaPlusProche[0] = coordToutLesBateaux[i][0];
				coordCibleLaPlusProche[1] = coordToutLesBateaux[i][1];
			}
		}		
		return coordCibleLaPlusProche;
	}
	
	public void test()
	{
		Bateau b = listeDeBateau.get(0);
		System.out.println("Y = "+b.getCoordY()+" X = "+b.getCoordX()+" Cible la plus proche = "+this.getCoordCiblePlusProcheDe(b)[0]+" ; "+this.getCoordCiblePlusProcheDe(b)[1]);
	}
	private int nbTourMax;	
	private int longueur;
	private int largeur;
	private ArrayList<Bateau> listeDeBateau;
	private int nbBateauCombatant;
	private int nbBateauHopital;
	private int nbBateauCible ;
}
