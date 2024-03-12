package banco;

public class TesteTransfere {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        
        minhaConta.deposita(1000);
        outraConta.deposita(1000);
        
        minhaConta.transfere(outraConta, 500);
        
        System.out.println("Saldo minhaConta: "+minhaConta.getSaldo());
        System.out.println("Saldo outraConta: "+outraConta.getSaldo());
        
    }
    
}
