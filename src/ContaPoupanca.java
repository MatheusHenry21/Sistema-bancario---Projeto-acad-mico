public class ContaPoupanca extends Conta{

    @Override
    public void atualizar(double taxaSelic){
        double valor = getSaldo() * (taxaSelic * .75);
        this.depositar(valor);
    }
}
