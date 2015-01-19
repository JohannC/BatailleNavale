package jeu;

import java.util.ArrayList;

import bateau.Bateau;
import bateau.BateauCible;
import bateau.BateauCombat;
import bateau.BateauHopital;

public class Océan {
	public Océan(int longueur, int largeur, int nbBateauCombatant, int nbBateauHopital, int nbBateauCible) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.nbBateauCombatant = nbBateauCombatant;
		this.nbBateauHopital = nbBateauHopital;
		this.nbBateauCible = nbBateauCible;
		//Création des bateaux
		for(int i = 0; i < this.nbBateauCombatant; i++)
		{
			listeDeBateau.add(new BateauCombat(this));
		}
		for(int i=0; i < this.nbBateauHopital; i++)
		{
			listeDeBateau.add(new BateauHopital(this));
		}
		for(int i=0; i < this.nbBateauCible; i++)
		{
			listeDeBateau.add(new BateauCible(this));
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

	private int longueur;
	private int largeur;
	private ArrayList<Bateau> listeDeBateau;
	private int nbBateauCombatant = 4;
	private int nbBateauHopital = 2;
	private int nbBateauCible = 5;
}
