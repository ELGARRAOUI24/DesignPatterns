package ma.iibdcc.implementation;

import ma.iibdcc.interfaces.Figure;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigures implements Figure {
    private List<Figure> figures = new ArrayList<>();

    public void ajouter(Figure f) { figures.add(f); }

    public void dessiner() {
        System.out.println("Début du Groupe :");
        for (Figure f : figures) f.dessiner();
        System.out.println("Fin du Groupe.");
    }
}
