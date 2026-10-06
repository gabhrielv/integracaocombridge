package a7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPFComAssinaturaDigital() {
        Cliente cliente = new Cliente(new FabricaPF(), new AssinaturaDigital());
        assertEquals("Contrato de Pessoa Física [assinatura digital]", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJComAssinaturaManuscrita() {
        Cliente cliente = new Cliente(new FabricaPJ(), new AssinaturaManuscrita());
        assertEquals("Contrato de Pessoa Jurídica [assinatura manuscrita]", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPFComAssinaturaManuscrita() {
        Cliente cliente = new Cliente(new FabricaPF(), new AssinaturaManuscrita());
        assertEquals("Procuração de Pessoa Física [assinatura manuscrita]", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJComAssinaturaDigital() {
        Cliente cliente = new Cliente(new FabricaPJ(), new AssinaturaDigital());
        assertEquals("Procuração de Pessoa Jurídica [assinatura digital]", cliente.emitirProcuracao());
    }
}
