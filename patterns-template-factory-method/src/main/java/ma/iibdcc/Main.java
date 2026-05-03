package ma.iibdcc;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Test du Pattern Template Method & Factory ---");

        Plugin monPlugin = PluginFactory.creerPlugin();

        System.out.println("Lancement de l'algorithme via le Framework :");
        monPlugin.executerAlgorithme();

        System.out.println("\n--- Fin du test ---");
    }
}