package ma.iibdcc.entities;

import ma.iibdcc.interfaces.Figure;

public class Rectangle implements Figure {
    @Override
    public void dessiner() {
        System.out.println("Dessin d'un Rectangle");
    }
}
