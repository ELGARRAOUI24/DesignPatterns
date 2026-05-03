package ma.iibdcc;

import ma.iibdcc.classes.Compresseur;
import ma.iibdcc.implementation.ImageFramework;
import ma.iibdcc.interfaces.Filtre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImageFramework framework = new ImageFramework();
        Scanner scanner = new Scanner(System.in);
        int[] imageDummy = {10, 20, 30};

        try {
            System.out.print("Nom de la classe de filtrage (ex: FiltreGris ou FiltreAdapter) : ");
            String filterClass = scanner.nextLine();
            Filtre f = (Filtre) Class.forName(filterClass).getDeclaredConstructor().newInstance();
            framework.setFiltre(f);

            System.out.print("Nom de la classe de compression (ex: CompresseurZip) : ");
            String compressClass = scanner.nextLine();
            Compresseur c = (Compresseur) Class.forName(compressClass).getDeclaredConstructor().newInstance();
            framework.setCompresseur(c);

            framework.effectuerTraitements(imageDummy);

        } catch (Exception e) {
            System.out.println("Erreur de chargement des classes : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}