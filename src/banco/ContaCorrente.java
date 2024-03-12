package banco;

public class ContaCorrente extends Conta {

    @Override
    public void atualiza(double taxa) {
        // Aplica o dobro da taxa ao saldo da conta corrente
        super.deposita(super.getSaldo() * taxa * 2); // Utiliza o método deposita da classe mãe
    }

    @Override
    public void deposita(double valor) {
        // Desconta a taxa bancária de 1 real
        super.deposita(valor - 1);
    }
}