public class SubMain {
    Banco clientes = new Banco();
    Util entradas = new Util();

    public void subMainContas(){
        while(true){
            System.out.println("\n   ---TIPOS---");
            System.out.println("1 - Conta simples");
            System.out.println("2 - Conta corrente");
            System.out.println("3 - Conta poupança");
            System.out.println("4 - Voltar");

            int opcao = entradas.opcao();

            if(opcao == 4){
                System.out.println("\nVoltando...");
                return;
            } else if(opcao == 1){
                Conta novaConta = new Conta();

                double saldo = entradas.saldo();
                novaConta.depositar(saldo);

                clientes.adicionar(novaConta);
            } else if (opcao == 2){
                ContaCorrente novaConta = new ContaCorrente();

                double saldo = entradas.saldo();
                novaConta.depositar(saldo);

                clientes.adicionar(novaConta);
            } else if (opcao == 3) {
                ContaPoupanca novaConta = new ContaPoupanca();

                double saldo = entradas.saldo();
                novaConta.depositar(saldo);

                clientes.adicionar(novaConta);
            } else{
                System.out.println("\nErro, opção inexistente!");
                continue;
            }
            System.out.println("Conta criada com sucesso!");
            return;
        }
    }
}
