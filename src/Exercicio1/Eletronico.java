package Exercicio1;

public class Eletronico extends Produto{
    String nome;
    int quantidade;
    double valor;

    public Eletronico(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    double calcularValorFinal() {
        return valorTotal * 0.15;
    }
}
