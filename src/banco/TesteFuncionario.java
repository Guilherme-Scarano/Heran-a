package banco;

public class TesteFuncionario {
    public static void main(String[] args) {
        // Criando um funcionário
        Funcionario funcionario1 = new Funcionario("João", "Vendas", 3000, "01/01/2022", "123456789");

        // Testando métodos
        funcionario1.bonifica(500); // Bonificação de 500
        funcionario1.demite(); // Demissão do funcionário

        // Imprimindo informações do funcionário
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Departamento: " + funcionario1.getDepartamento());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Data de Entrada no Banco: " + funcionario1.getDataEntradaBanco());
        System.out.println("RG: " + funcionario1.getRG());
        System.out.println("Ativo: " + funcionario1.isAtivo());
    }
}
