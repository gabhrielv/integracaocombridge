package a7;

public class Main {

    public static void main(String[] args) {

        FabricaFactory factory = FabricaFactory.getInstance();

    
        Cliente clientePFDigital = new Cliente(
            factory.obterFabrica("PF"), new AssinaturaDigital());
            System.out.println(clientePFDigital.emitirContrato());
            System.out.println(clientePFDigital.emitirProcuracao());

            Cliente clientePFManuscrito = new Cliente(
                factory.obterFabrica("PF"), new AssinaturaManuscrita());
                System.out.println(clientePFManuscrito.emitirContrato());
                System.out.println(clientePFManuscrito.emitirProcuracao());

                Cliente clientePJDigital = new Cliente(
                    factory.obterFabrica("PJ"), new AssinaturaDigital());
                    System.out.println(clientePJDigital.emitirContrato());
                    System.out.println(clientePJDigital.emitirProcuracao());

                    Cliente clientePJManuscrito = new Cliente(
                        factory.obterFabrica("PJ"), new AssinaturaManuscrita());
                        System.out.println(clientePJManuscrito.emitirContrato());
                        System.out.println(clientePJManuscrito.emitirProcuracao());

                        System.out.println("Mesma instância da FabricaFactory (Singleton)? "
                        + (factory == FabricaFactory.getInstance()));

    }
}
