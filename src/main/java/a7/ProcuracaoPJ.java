package a7;

public class ProcuracaoPJ extends Documento implements Procuracao {

    public String emitir() {
        return emitirDocumento("Procuração PJ");
    }
}
