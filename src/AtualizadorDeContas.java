public class AtualizadorDeContas {
    private double saldoTotal;
    private double selic;

    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    public void rodar(Conta c){
        System.out.print("\n" + "Saldo anterior: " + c.getSaldo() + "\n");
        c.atualizar(this.selic);
        System.out.print("Saldo atual: " + c.getSaldo() + "\n");
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal(){
        return this.saldoTotal;
    }
}
