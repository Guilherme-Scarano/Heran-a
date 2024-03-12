package banco;

public class ContaPoupanca extends Conta {

    @Override
    public void atualiza(double taxa) {
        
        super.deposita(super.getSaldo() * taxa * 3);
    }
}