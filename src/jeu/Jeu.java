package jeu;
import java.util.ArrayList;
import jeu.Oc�an;
import bateau.Bateau;

public class Jeu {
	public Jeu(int longueur, int largeur, int tourMax, int nbBateauCombatant, int nbBateauHopital, int nbBateauCible)
	{
		this.terrainDeJeu = new Oc�an(longueur,largeur, nbBateauCombatant, nbBateauHopital, nbBateauCible);
		this.nbTourMax = tourMax;		
	}	
	private Oc�an terrainDeJeu;
	private int nbTourMax;
	
}
