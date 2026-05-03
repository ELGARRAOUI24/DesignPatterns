package ma.iibdcc.implementation;

import ma.iibdcc.interfaces.Filtre;

public class FiltreGris implements Filtre {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Application du filtre Gris...");
        return data;
    }
}
