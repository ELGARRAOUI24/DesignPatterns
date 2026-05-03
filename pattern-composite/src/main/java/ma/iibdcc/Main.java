package ma.iibdcc;

import ma.iibdcc.entities.Cercle;
import ma.iibdcc.entities.Rectangle;
import ma.iibdcc.implementation.GroupeFigures;
import ma.iibdcc.interfaces.Figure;

public class Main {
    public static void main(String[] args) {
        Figure cercle1 = new Cercle();
        Figure rect1 = new Rectangle();
        Figure cercle2 = new Cercle();

        GroupeFigures groupe1 = new GroupeFigures();
        groupe1.ajouter(cercle1);
        groupe1.ajouter(rect1);

        GroupeFigures groupePrincipal = new GroupeFigures();
        groupePrincipal.ajouter(groupe1);
        groupePrincipal.ajouter(cercle2);

        System.out.println("--- Affichage d'une figure simple ---");
        cercle1.dessiner();

        System.out.println("\n--- Affichage du groupe principal (Hiérarchie) ---");
        groupePrincipal.dessiner();
    }
}