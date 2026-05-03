package ma.iibdcc;

abstract class Plugin {
    public final void executerAlgorithme() {
        System.out.println("Initialisation...");
        partie1();
        System.out.println("Traitement intermédiaire...");
        partie2();
    }

    protected abstract void partie1();
    protected abstract void partie2();
}