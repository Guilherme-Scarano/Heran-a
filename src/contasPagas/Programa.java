package contasPagas;

public class Programa {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNomeCliente("João da Silva");
        cliente1.setCpf("123.456.789-10");
        
        Cliente cliente2 = new Cliente();
        cliente2.setNomeCliente("Maria Oliveira");
        cliente2.setCpf("987.654.321-00");
        
        Produto produto1 = new Produto();
        produto1.setDescricaoProduto("Camiseta");
        produto1.setValorProduto(29.99);
        
        Produto produto2 = new Produto();
        produto2.setDescricaoProduto("Calça Jeans");
        produto2.setValorProduto(59.99);
        
        Conta conta1 = new Conta();
        conta1.setIdConta(1);
        conta1.setDataVencimento("10/03/2024");
        conta1.setDataPagamento("05/03/2024");
        conta1.setPro(produto1);
        conta1.setCli(cliente1);
        
        Conta conta2 = new Conta();
        conta2.setIdConta(2);
        conta2.setDataVencimento("15/03/2024");
        conta2.setDataPagamento("10/03/2024");
        conta2.setPro(produto2);
        conta2.setCli(cliente2);
        
        // Visualização das contas
        System.out.println("Conta 1:");
        conta1.visualizarConta();
        
        System.out.println("\nConta 2:");
        conta2.visualizarConta();
    }
    
}