package ma.iibdcc.implementation;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Ancien filtre utilisé : " + filterName);
        return data;
    }
}
