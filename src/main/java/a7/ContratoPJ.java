package a7;

public class ContratoPJ extends Documento implements Contrato {

    public String emitir() {
        return emitirDocumento("Contrato PJ");
    }
}
