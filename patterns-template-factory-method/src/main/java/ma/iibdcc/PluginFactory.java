package ma.iibdcc;

public class PluginFactory {
    public static Plugin creerPlugin() {
        return new MonPluginConcret();
    }
}
