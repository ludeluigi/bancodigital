public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente1) {
        super(cliente1);
    }

    @Override
    public void imprimirExtrato() {

            System.out.println("**** extrato conta poupança ****");
        super.imprimirInformacoesComuns();
}
}
