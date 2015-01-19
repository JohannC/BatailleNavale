package game;

import java.util.ArrayList;
import java.util.Random;

import bateau.Bateau_Généric;

public class Jeu {

	public Jeu(int Longueur, int Largeur, int nbBateau, int nbTourMax) {
		this.Longueur = Longueur;
		this.Largeur = Largeur;
		this.nbBateau = nbBateau;
		this.nbTourMax = nbTourMax;
	}

	public void initialiserJeu() {
		this.listeDeBateau = new ArrayList<Bateau_Généric>();
		Random coordY = new Random(this.Longueur);
		Random coordX = new Random(this.Largeur);
		for (int i = 0; i < nbBateau; i++) {
			listeDeBateau.add(new Bateau_Généric(coordY.nextInt(),coordX.nextInt()));
		}
	}	

	private  int Longueur;
	private  int Largeur;
	private  int nbBateau;
	private  int nbTourMax;
	private ArrayList<Bateau_Généric> listeDeBateau;
}
