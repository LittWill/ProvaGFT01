package Exercicio4;

public class Teste {

    public static void main(String[] args) {
        Círculo circulo = new Círculo(5);

        Quadrado quadrado = new Quadrado(3);

        Retângulo retangulo = new Retângulo(2, 4);

        System.out.println("Círculo: " + circulo.calculaArea());
        System.out.println("Quadrado: " + quadrado.calculaArea());
        System.out.println("Retângulo: " + retangulo.calculaArea());
    }

}
