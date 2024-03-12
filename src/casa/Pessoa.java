package casa;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    
    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Método para fazer aniversário
    public void fazAniversario() {
        idade++;
    }
    
    // Método para imprimir nome e idade
    public void imprimeNomeIdade() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
    public static void main(String[] args) {
        // Criando uma pessoa
        Pessoa pessoa = new Pessoa("Juca", 25);
        
        // Imprimindo nome e idade iniciais
        System.out.println("Antes do aniversário:");
        pessoa.imprimeNomeIdade();
        
        // Fazendo aniversário
        pessoa.fazAniversario();
        
        // Imprimindo nome e idade depois do aniversário
        System.out.println("\nDepois do aniversário:");
        pessoa.imprimeNomeIdade();
    }
}
