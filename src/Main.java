import java.util.ArrayList;

public class Main {
    public static void main() {
        Util entradas = new Util();
        Banco clientes = new Banco();
        SubMain subMenus = new SubMain();
        AtualizadorDeContas atualizacao = new AtualizadorDeContas(.08);

        System.out.println("\nBem-vindo ao Banco!");

        while(true){

            System.out.println("\n   ---MENU---");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Atualizar contas");
            System.out.println("3 - Sair");

            int opcao = entradas.opcao();

            if (opcao == 3){
                System.out.println("\nSaindo... até logo!");
                break;

            } else if (opcao == 1) {
                subMenus.subMainContas();

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