package a7;

public class ProcuracaoPF extends Documento implements Procuracao {

    public String emitir() {
        return emitirDocumento("Procuração PF");
    }
}
