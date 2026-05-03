package ma.iibdcc.classes;

public abstract class Compresseur {

    public final int[] compresser(int[] data) {
        System.out.println("Initialisation de la compression...");
        int[] result = doCompress(data);
        System.out.println("Compression terminée.");
        return result;
    }

    protected abstract int[] doCompress(int[] data);
}
