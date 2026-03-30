import java.util.Scanner;

public class Util {
    Scanner sc = new Scanner(System.in);

    public int opcao(){
        System.out.print("\nDigite a opçao: ");
        int opcao = sc.nextInt();
        return opcao;
    }

    public double saldo(){
        System.out.print("\nDigite um saldo para depósito: ");
        double saldo = sc.nextDouble();
        return saldo;
    }
}
