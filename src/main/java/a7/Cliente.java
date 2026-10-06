package a7;

public class Cliente {

    private Contrato contrato;

    private Procuracao procuracao;

    public Cliente(FabricaAbstrata fabrica, Assinatura assinatura) {
        this.contrato = fabrica.criarContrato();
        this.procuracao = fabrica.criarProcuracao();
        this.contrato.setAssinatura(assinatura);
        this.procuracao.setAssinatura(assinatura);
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }
}
