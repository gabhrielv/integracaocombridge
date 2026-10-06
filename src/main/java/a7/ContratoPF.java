package a7;

public class ContratoPF extends Documento implements Contrato {

    public String emitir() {
        return emitirDocumento("Contrato de Pessoa Física");
    }
}