package Exercicio1;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Produto> produto = null;
        var produto1 = new Eletronico("Ventilador", 3, 320);
        var produto2 = new Eletronico("Computador", 2, 3999);
        var produto3 = new Movel("Mesa", 2, 270);
        var produto4 = new Produto("Caderno", 10, 10.50);
        var produto5 = new Movel("Cadeira", 2, 234.25);
        var produto6 = new Produto("Caneta", 15, 0.70);

        produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);
        produto.add(produto4);
        produto.add(produto5);
        produto.add(produto6);


        Caixa caixa = new Caixa();
        caixa.calcularTotal(produto);
    }
}
