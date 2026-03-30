public class Conta {
    private double saldo;

    public Conta(){
        this.saldo = 0;
    }

    public void depositar(double valor){
        if (valor < 0){
            return;
        }
        this.saldo += valor;
    }

    public Boolean sacar(double valor){
        if (valor < this.saldo){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void atualizar(double taxaSelic){
        double valor = this.saldo * (taxaSelic);
        this.depositar(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }
}
