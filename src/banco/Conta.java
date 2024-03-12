package banco;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    
    private Cliente cliente; // Referência ao cliente da conta
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean saca(double quantidade) {
        if (this.saldo + this.limite >= quantidade) {
            this.saldo -= quantidade;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente: " + this.saldo);
            return false;
        }
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    public void transfere(Conta destino, double quantidade) {
        if (this.saca(quantidade)) {
            destino.deposita(quantidade);
        } else {
            System.out.println("Transferência não realizada!");
        }
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa / 100); // Atualiza o saldo com a taxa percentual
    }
}
