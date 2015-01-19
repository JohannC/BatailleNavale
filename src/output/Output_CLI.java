package output;

import java.util.Scanner;

import game.Jeu;

public class Output_CLI {
	private static Jeu batailleNavale;

	public static void initialisation() {
		System.out.println("Configuration du jeu");
		Scanner in = new Scanner(System.in);
		System.out.println("Longueur de la table");
		if (in.hasNextInt()) {
			int longueur = in.nextInt();
			System.out.println("Largeur de la table");
			if (in.hasNextInt()) {
				int largeur = in.nextInt();
				System.out.println("NbBateau sur la table");
				if (in.hasNextInt()) {
					int nbBateau = in.nextInt();
					System.out.println("NbTourMax du jeu");
					if (in.hasNext()) {
						int nbTourMax = in.nextInt();
						Output_CLI.batailleNavale = new Jeu(longueur, largeur,
								nbBateau, nbTourMax);
						Output_CLI.batailleNavale.initialiserJeu();
						in.close();
					} else {
						in.close();
						throw new RuntimeException("!= int");
					}
				} else {
					in.close();
					throw new RuntimeException("!= int");
				}
			} else {
				in.close();
				throw new RuntimeException("!= int");
			}

		} else {
			in.close();
			throw new RuntimeException("!= int");
		}

	}

	public static void afficherEnvironnement() {

	}
}
