package ma.iibdcc;

import ma.iibdcc.entities.Gardien;
import ma.iibdcc.entities.Joueur;
import ma.iibdcc.interfaces.Observateur;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Test du Pattern Observer ---");

        Joueur joueur = new Joueur();

        Gardien gardien = new Gardien();

        Observateur camera = new Observateur() {
            @Override
            public void actualiser(int score) {
                System.out.println("Le joueur a atteint un score de " + score);
            }
        };

        joueur.ajouterObservateur(gardien);
        joueur.ajouterObservateur(camera);

        System.out.println("Action : Le joueur ramasse un objet précieux (+10 points).");
        joueur.setScore(10);

        System.out.println("\nAction : Le joueur élimine une cible (+50 points).");
        joueur.setScore(60);
    }
}