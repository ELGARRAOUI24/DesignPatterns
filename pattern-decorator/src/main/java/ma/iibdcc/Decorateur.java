package ma.iibdcc;

import ma.iibdcc.interfaces.Composant;

abstract class Decorateur implements Composant {
    protected Composant composant;
    public Decorateur(Composant c) { this.composant = c; }
    public void traitement() { composant.traitement(); }
}
