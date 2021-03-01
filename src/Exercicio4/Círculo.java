package Exercicio4;

public class Círculo implements AreaCalculavel{
    double raio;

    public Círculo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * (raio * raio);
    }
}
