package banco;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Cliente cli1 = new Cliente(); // Criando um objeto Cliente
        c1.setCliente(cli1); // Atribuindo o objeto Cliente à conta

        // Agora você pode acessar e modificar o cliente associado à conta
        c1.getCliente().setNome("Paola");

        c1.deposita(1000);

        System.out.println("Saldo conta: " + c1.getSaldo());

        // Agora você pode imprimir o nome do cliente associado à conta
        System.out.println("Cliente: " + c1.getCliente().getNome());
    }
}

