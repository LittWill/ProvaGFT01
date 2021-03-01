package Exercicio1;

import java.util.List;

public class Caixa {

    public double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void calcularTotal (List<Produto> produtos){

        for (var produto: produtos){
            valorTotal += produto.valor;
        }
        System.out.println(getValorTotal());

    }


}
