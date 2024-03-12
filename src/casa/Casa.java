package casa;

public class Casa {
    // Atributos
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    // Construtor
    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }
    
    // Método para pintar a casa com uma cor específica
    public void pinta(String s) {
        this.cor = s;
        System.out.println("A casa foi pintada de " + s + ".");
    }
    
    // Método para verificar quantas portas estão abertas
    public int quantasPortasEstaoAbertas() {
        int count = 0;
        if (porta1.estaAberta()) count++;
        if (porta2.estaAberta()) count++;
        if (porta3.estaAberta()) count++;
        return count;
    }
    
    public static void main(String[] args) {
        // Criando uma casa
        Casa casa = new Casa("Amarelo");
        
        // Pintando a casa
        casa.pinta("Azul");
        
        // Criando três portas e colocando-as na casa
        Porta porta1 = casa.porta1;
        Porta porta2 = casa.porta2;
        Porta porta3 = casa.porta3;
        
        // Abrindo e fechando as portas como desejar
        porta1.abre();
        porta2.abre();
        porta3.fecha();
        
        // Imprimindo o número de portas abertas
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}
