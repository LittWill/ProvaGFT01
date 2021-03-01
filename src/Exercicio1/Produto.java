package Exercicio1;

public class Produto {
    String nome;
    int quantidade;
    double valor;
    double valorTotal = quantidade * valor;

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    double calcularValorFinal(){
        return valorTotal * 0.10;
    }

}
