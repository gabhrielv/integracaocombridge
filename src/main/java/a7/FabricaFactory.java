package a7;

public class FabricaFactory {

    private static FabricaFactory instance = new FabricaFactory();

    private FabricaFactory() {
    }

    public static FabricaFactory getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String tipo) {
        if ("PF".equalsIgnoreCase(tipo)) {
            return new FabricaPF();
        }
        if ("PJ".equalsIgnoreCase(tipo)) {
            return new FabricaPJ();
        }
        throw new IllegalArgumentException("Fábrica inexistente");
    }
}
