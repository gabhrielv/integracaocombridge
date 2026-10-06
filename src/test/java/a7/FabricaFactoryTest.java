package a7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaFactoryTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(FabricaFactory.getInstance(), FabricaFactory.getInstance());
    }

    @Test
    void deveRetornarFabricaPF() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PF");
        assertInstanceOf(FabricaPF.class, fabrica);
    }

    @Test
    void deveRetornarFabricaPJ() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PJ");
        assertInstanceOf(FabricaPJ.class, fabrica);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> FabricaFactory.getInstance().obterFabrica("PX"));
        assertEquals("Fábrica inexistente", e.getMessage());
    }
}
