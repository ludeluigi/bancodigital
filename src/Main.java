public class Main {
    public static void main(String[] args) {
        Cliente luigi = new Cliente();
        luigi.setNome("luigi");
        Conta contaCorrente = new ContaCorrente(luigi);
        contaCorrente.depositar(100);
        Conta contaPoupança = new ContaPoupanca(luigi);
        contaCorrente.transferir(50, contaPoupança);
contaCorrente.imprimirExtrato();
contaPoupança.imprimirExtrato();
    }
}
