package a7;

public abstract class Documento implements Assinavel {

    private Assinatura assinatura;

    public void setAssinatura(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    protected String emitirDocumento(String ass) {
        if (assinatura == null) {
            throw new IllegalStateException("Assinatura inválida");
        }
        return assinatura.aplicar(ass);
    }

    public abstract String emitir();
    
}
