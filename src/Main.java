import java.util.ArrayList;

public class Main {
    public static void main() {
        Util entradas = new Util();
        Banco clientes = new Banco();
        AtualizadorDeContas atualizacao = new AtualizadorDeContas(.08);

        System.out.println("Bem-vindo ao Banco!");

        while(true){

            System.out.println("\n---MENU---\n");
            System.out.println("1 - Adicionar contas");
            System.out.println("2 - Atualizar contas");
            System.out.println("3 - Sair");

            System.out.print("\nDigite a opçao: ");
            int opcao = entradas.opcao();

            if (opcao == 3){
                System.out.println("\nSaindo... até logo!");
                break;

            } else if (opcao == 1) {
                Conta novaConta = new Conta();

                System.out.print("\nDigite um saldo para depósito: ");
                double saldo = entradas.saldo();
                novaConta.depositar(saldo);

                clientes.adicionar(novaConta);

            } else if (opcao == 2) {
                ArrayList<Conta> contas = new ArrayList<>(clientes.getContas());
                for (Conta c : contas){
                    atualizacao.rodar(c);
                }
                System.out.print("\nSaldo total: ");
                System.out.println(atualizacao.getSaldoTotal());
            } else{
                System.out.println("\nErro, opção inexistente!");

            }
        }
    }
}