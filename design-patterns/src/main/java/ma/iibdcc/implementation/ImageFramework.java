package ma.iibdcc.implementation;

import ma.iibdcc.classes.Compresseur;
import ma.iibdcc.interfaces.Filtre;

public class ImageFramework {
    private Filtre filtre;
    private Compresseur compresseur;

    public void setFiltre(Filtre filtre) {
        this.filtre = filtre;
    }

    public void setCompresseur(Compresseur compresseur) {
        this.compresseur = compresseur;
    }

    public int[] effectuerTraitements(int[] data) {
        if (filtre != null) data = filtre.filter(data);
        if (compresseur != null) data = compresseur.compresser(data);
        return data;
    }
}
