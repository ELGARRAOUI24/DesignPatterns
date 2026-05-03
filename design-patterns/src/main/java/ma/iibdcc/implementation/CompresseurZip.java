package ma.iibdcc.implementation;

import ma.iibdcc.classes.Compresseur;

public class CompresseurZip extends Compresseur {
    @Override
    protected int[] doCompress(int[] data) {
        System.out.println("Compression selon l'algorithme ZIP");
        return data;
    }
}
