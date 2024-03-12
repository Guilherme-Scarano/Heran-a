package casa;

public class Porta {
    // Atributos
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    // Construtor
    public Porta() {
        this.aberta = false; // porta fechada por padrão
        this.cor = "Branco"; // cor padrão
        this.dimensaoX = 80.0; // dimensões padrão
        this.dimensaoY = 200.0;
        this.dimensaoZ = 4.0;
    }
    
    // Método para abrir a porta
    public void abre() {
        this.aberta = true;
        System.out.println("A porta foi aberta.");
    }
    
    // Método para fechar a porta
    public void fecha() {
        this.aberta = false;
        System.out.println("A porta foi fechada.");
    }
    
    // Método para pintar a porta com uma cor específica
    public void pinta(String s) {
        this.cor = s;
        System.out.println("A porta foi pintada de " + s + ".");
    }
    
    // Método para verificar se a porta está aberta
    public boolean estaAberta() {
        return this.aberta;
    }
    
    // Método para exibir as dimensões da porta
    public void exibeDimensoes() {
        System.out.println("Dimensões da porta:");
        System.out.println("  Largura (X): " + this.dimensaoX);
        System.out.println("  Altura (Y): " + this.dimensaoY);
        System.out.println("  Espessura (Z): " + this.dimensaoZ);
    }
    
    public static void main(String[] args) {
        // Criando uma porta
        Porta porta = new Porta();
        
        // Verificando se a porta está aberta
        System.out.println("A porta está aberta? " + porta.estaAberta());
        
        // Abrindo a porta
        porta.abre();
        
        // Verificando se a porta está aberta novamente
        System.out.println("A porta está aberta? " + porta.estaAberta());
        
        // Fechando a porta
        porta.fecha();
        
        // Pintando a porta de várias cores
        porta.pinta("Azul");
        porta.pinta("Vermelho");
        
        // Exibindo dimensões da porta
        porta.exibeDimensoes();
        
        // Alterando dimensões da porta
        System.out.println("\nDimensões atualizadas:");
        porta.dimensaoX = 90.0;
        porta.dimensaoY = 210.0;
        porta.dimensaoZ = 5.0;
        
        // Exibindo dimensões atualizadas da porta
        porta.exibeDimensoes();
    }
}
