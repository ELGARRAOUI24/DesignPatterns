package ma.iibdcc;

import ma.iibdcc.interfaces.Composant;

public class LogDecorateur extends Decorateur {
    public LogDecorateur(Composant c) { super(c); }

    @Override
    public void traitement() {
        System.out.println("Avant le traitement...");
        super.traitement();
        System.out.println("Après le traitement...");
    }
}
