package a7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    @Test
    void devePermitirTrocarImplementacaoDaAssinatura() {
        ContratoPF contrato = new ContratoPF();

        contrato.setAssinatura(new AssinaturaDigital());
        assertEquals("Contrato de Pessoa Física [assinatura digital]", contrato.emitir());

        contrato.setAssinatura(new AssinaturaManuscrita());
        assertEquals("Contrato de Pessoa Física [assinatura manuscrita]", contrato.emitir());
    }

    @Test
    void deveLancarExcecaoQuandoNaoHouverAssinatura() {
        Documento documento = new ContratoPJ();

        IllegalStateException excecao = assertThrows(
                IllegalStateException.class,
                documento::emitir
        );

        assertEquals("Assinatura não definida", excecao.getMessage());
    }

    @Test
    void assinaturaRecebeOConteudoOriginalDoDocumento() {
        Assinatura assinatura = conteudo -> "assinado: " + conteudo;
        Contrato contrato = new ContratoPF();
        contrato.setAssinatura(assinatura);

        assertEquals("assinado: Contrato de Pessoa Física", contrato.emitir());
    }
}
