package Exercicio4;

public class Retângulo implements AreaCalculavel{
    double largura, altura;

    public Retângulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return largura * altura;
    }
}
