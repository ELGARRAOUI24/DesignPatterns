package ma.iibdcc.entities;

import ma.iibdcc.interfaces.Observateur;

public class Gardien implements Observateur {
    public void actualiser(int score) {
        System.out.println("Le Gardien sait que le score est : " + score);
    }
}
