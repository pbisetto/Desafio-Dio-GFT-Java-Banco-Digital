public class Main {
    public static void main(String[] args) {
// Dados da pessoa2 1
        Endereco logradouro = new Endereco (13238260);
        logradouro.setNomeRua("Santo Antonio");
        logradouro.setBairro("Casa Verde");
        logradouro.setNumeroCasa(55);

        Cliente pessoa = new Cliente();
        pessoa.setNome("Paulo");
        pessoa.setEndereco(logradouro);

// Dados da pessoa2 2
        Endereco logradouro2 = new Endereco (14910518);
        logradouro2.setNomeRua("Cristovão Colombo");
        logradouro2.setBairro("Colina do Pontal");
        logradouro2.setNumeroCasa(267);

        Cliente pessoa2 = new Cliente();
        pessoa2.setNome("mariano");
        pessoa2.setEndereco(logradouro2);

       // Transações

        Conta cc = new ContaCorrente(pessoa2);
        cc.depositar(2000);
        Conta poupanca = new ContaPoupanca(pessoa2);
        cc.transferir(450, poupanca);

        Conta ccp1 = new ContaCorrente(pessoa);
        ccp1.depositar(1500);
        Conta poupancap1 = new ContaPoupanca(pessoa);
        ccp1.transferir(299, poupancap1);

        System.out.println("Dados antes da transferência");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        ccp1.imprimirExtrato();
        poupancap1.imprimirExtrato();

        ccp1.transferir(800,cc);

        System.out.println("Dados antes da transferência");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        ccp1.imprimirExtrato();
        poupancap1.imprimirExtrato();

    }
    
}
