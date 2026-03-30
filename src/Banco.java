import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static ArrayList<Conta> contas = new ArrayList<>();

    public void adicionar(Conta c){
        contas.add(c);
    }

    public Conta pegar(int x){
        return contas.get(x);
    }

    public int pegarTotalDeContas(){
        return contas.size();
    }

    public List<Conta> getContas(){
        return new ArrayList<Conta>(this.contas);
    }
}