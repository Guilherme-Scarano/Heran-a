package banco;

public class Funcionario {
    // Atributos
    private String nome;
    private String departamento;
    private double salario;
    private String dataEntradaBanco;
    private String RG;
    private boolean ativo;

    // Construtor
    public Funcionario(String nome, String departamento, double salario, String dataEntradaBanco, String RG) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntradaBanco = dataEntradaBanco;
        this.RG = RG;
        this.ativo = true; // Por padrão, funcionário está ativo quando é criado
    }

    // Métodos
    public void bonifica(double aumento) {
        this.salario += aumento;
        System.out.println("Funcionário " + this.nome + " foi bonificado. Novo salário: " + this.salario);
    }

    public void demite() {
        this.ativo = false;
        System.out.println("Funcionário " + this.nome + " foi demitido.");
    }
    
    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Entrada no Banco: " + this.dataEntradaBanco);
        System.out.println("RG: " + this.RG);
        System.out.println("Ativo: " + this.ativo);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
