package ma.iibdcc.entities;

import ma.iibdcc.interfaces.Figure;

public class Cercle implements Figure {
    @Override
    public void dessiner() {
        System.out.println("Dessin d'un Cercle");
    }
}
