package ma.iibdcc;

import ma.iibdcc.interfaces.Composant;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Test du Pattern Decorator ---");

        Composant simple = new ComposantConcret();

        System.out.println("1. Exécution du composant seul :");
        simple.traitement();
        System.out.println("--------------------------------");

        Composant avecLog = new LogDecorateur(simple);

        System.out.println("2. Exécution du composant décoré (avec Log) :");
        avecLog.traitement();
        System.out.println("--------------------------------");
    }
}