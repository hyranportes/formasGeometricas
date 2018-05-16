package formaGeometrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o tamanho do lado do seu quadrado :)");
        float ladoQuadrado = scanner.nextFloat();

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(ladoQuadrado);
        System.out.println("A area do quadrado é: " + quadrado.calcularArea());
        System.out.println("O perímetro do quadrado é: " + quadrado.calcularPerimetro());


        System.out.println("Por favor, digite o tamanho do raio do seu circulo >=]");
        float raioCirculo = scanner.nextFloat();

        Circulo circulo = new Circulo();
        circulo.setRaio(raioCirculo);
        System.out.println("A area do circulo é: " + circulo.calcularArea());
        System.out.println("O perímetro do circulo é: " + circulo.calcularPerimetro());
    }
}
