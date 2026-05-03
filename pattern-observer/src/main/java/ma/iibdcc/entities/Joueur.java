package ma.iibdcc.entities;

import ma.iibdcc.interfaces.Observateur;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private List<Observateur> observateurs = new ArrayList<>();
    private int score;

    public void ajouterObservateur(Observateur o) { observateurs.add(o); }

    public void setScore(int nouveauScore) {
        this.score = nouveauScore;
        notifier();
    }

    private void notifier() {
        for (Observateur o : observateurs) o.actualiser(score);
    }
}
