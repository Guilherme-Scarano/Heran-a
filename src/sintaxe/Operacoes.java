package sintaxe;

public class Operacoes {

    double n1, n2, resultado; // variavel de instância ou um atributo

    public double soma(double n1, double n2) { //métodos
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = this.n1 + this.n2;
        return this.resultado;
    }

}
