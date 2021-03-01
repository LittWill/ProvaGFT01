package Exercicio3;

import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Intervalo inicial: ");
        int intervaloInicial = scanner.nextInt();

        System.out.print("Intervalo final: ");
        int intervaloFinal = scanner.nextInt();

        if(intervaloFinal - intervaloInicial > 15){
            System.out.println("O intervalo não pode ser maior que 15!");
        }
        else{
            for(int i = intervaloInicial; i <= intervaloFinal; i++){
                System.out.println(i + ": " + (int) Math.pow(i, 3));
            }
        }


    }

}
