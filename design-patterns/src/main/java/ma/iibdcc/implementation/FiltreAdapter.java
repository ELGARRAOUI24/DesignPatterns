package ma.iibdcc.implementation;

import ma.iibdcc.interfaces.Filtre;

public class FiltreAdapter implements Filtre {
    private ImplNonStandard oldImpl = new ImplNonStandard();

    @Override
    public int[] filter(int[] data) {
        return oldImpl.appliquerFiltre("AncienFiltre", data);
    }
}
