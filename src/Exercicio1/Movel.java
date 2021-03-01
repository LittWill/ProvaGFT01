package Exercicio1;

public class Movel extends Produto{

    String nome;
    int quantidade;
    double valor;

    public Movel(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    double calcularValorFinal() {
        if(quantidade < 10){
            return valorTotal * 0.11;
        }
        else{
            return valorTotal * 0.05;
        }

    }

}
