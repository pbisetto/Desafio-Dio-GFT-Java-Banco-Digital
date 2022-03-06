public class Main {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");

        Conta cc = new ContaCorrente(paulo);
        Conta poupanca = new ContaPoupanca(paulo);

        cc.depositar(500);
        cc.transferir(250, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
