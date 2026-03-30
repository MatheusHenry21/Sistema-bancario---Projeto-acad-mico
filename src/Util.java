import java.util.Scanner;

public class Util {
    Scanner sc = new Scanner(System.in);

    public int opcao(){
        int opcao = sc.nextInt();
        return opcao;
    }

    public double saldo(){
        double saldo = sc.nextDouble();
        return saldo;
    }
}
