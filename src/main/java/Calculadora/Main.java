package Calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora;

        System.out.println("Resultados: ");

        calculadora = new Soma();
        System.out.println("Soma:" + calculadora.calcular(25,75));

        calculadora = new Subtracao();
        System.out.println("Subtracao: " + calculadora.calcular(100,75));

        calculadora = new Multiplicacao();
        System.out.println("Multiplicacao: " + calculadora.calcular(3,10));

        calculadora = new Divisao();
        System.out.println("Divisao: "+ calculadora.calcular(50,5));


    }
}
