public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente() {
        super();
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("**** extrato conta corrente ****");
        super.imprimirInformacoesComuns();
       /* System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Conta: %d", super.conta));
        System.out.println(String.format("Saldo:%2f", super.saldo));*/

    }
}
