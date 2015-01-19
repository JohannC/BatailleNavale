package jeu;
import java.util.ArrayList;
import jeu.Océan;
import bateau.Bateau;

public class Jeu {
	public Jeu(int longueur, int largeur, int tourMax, int nbBateauCombatant, int nbBateauHopital, int nbBateauCible)
	{
		this.terrainDeJeu = new Océan(longueur,largeur, nbBateauCombatant, nbBateauHopital, nbBateauCible);
		this.nbTourMax = tourMax;		
	}	
	private Océan terrainDeJeu;
	private int nbTourMax;
	
}
